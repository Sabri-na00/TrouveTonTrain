package Servlets;

import jdk.nashorn.internal.parser.JSONParser; //to parse and use JSON data from SNCF API
import org.json.JSONException;
import org.json.JSONObject;

import mypackage.TonTrainService;//import the service

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

@WebServlet(urlPatterns = "/ServletPost")
public class ServletPost extends HttpServlet{

    private static StringBuilder jsonContent=new StringBuilder("");//

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //get all the information from the client
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String villeDepart = request.getParameter("villeDepart");
        String villeArrivee = request.getParameter("villeArrivee");
        String heureDepart = request.getParameter("heureDepart");
        String devise = request.getParameter("devise");
        mypackage.TonTrain service = new TonTrainService().getTonTrainPort();

        //invoke business method
        //To avoid SSL errors
        // Create a trust manager that does not validate certificate chains
        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager(){
            public X509Certificate[] getAcceptedIssuers(){return null;}
            public void checkClientTrusted(X509Certificate[] certs, String authType){}
            public void checkServerTrusted(X509Certificate[] certs, String authType){}
        }};

// Install the all-trusting trust manager
        try {
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, trustAllCerts, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            ;
        }

    //the key to access to the sncf API
        String key = "7b6e8b74-0fa9-47ee-a83f-277159448ffc";

            URL url = new URL(null,"https://" + key + "@api.sncf.com/v1/coverage/sncf/stop_areas", new sun.net.www.protocol.https.Handler());
            HttpsURLConnection connection = (HttpsURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", key);//to avoid the error connection non authorized

            if (connection.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : " + connection.getResponseCode());
            } else {
                InputStreamReader in = new InputStreamReader(connection.getInputStream());
                BufferedReader br = new BufferedReader(in);
                String output;
                while((output = br.readLine()) != null) {
                    jsonContent.append(output);
                }
            }

        //the json content


         /*

         // after trying to parse the jsonContent from SNCF API

         String txt=jsonContent.toString().replace("\"","\""+"\\");
         JSONObject jsonObj = new JSONObject(txt);
         System.out.print(jsonObj.getString("firstname"));
         //code doesn't work :
         //error : Exception in thread "main" org.json.JSONException: Expected a ':' after a key at 16 [character 17 line 1]

         //a sample code that works
         JSONObject jsonObj = new JSONObject("{\"firstname\":\"John\",\"lastname\":\"Lee\"}");
         System.out.print(jsonObj.getString("firstname"));

             */

          out.println(villeDepart+" "+/* the soap service test : calculDistance */ service.getDistance(24,34,34,40)+" "+jsonContent/* json content from the API*/);
    }
}

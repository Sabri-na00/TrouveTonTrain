import javax.ws.rs.*;

@Path("/prix")


public class CalculPrix {

    @GET
    @Path("{distance}/{monnaie}")
    @Produces("application/json")
    public String calculPrix(@PathParam("distance") double distance,@PathParam("monnaie") String monnaie){
        double newPrix = 0.0;
        if(monnaie.equals("€")){
            newPrix = distance*0.16;
        }else if(monnaie.equals("$")){
            newPrix = distance*0.18;
        }

        String prixFinal = Double.toString(newPrix);
        return "{\"prix\":"+"\""+prixFinal+monnaie+"\""+"}";
    }
}

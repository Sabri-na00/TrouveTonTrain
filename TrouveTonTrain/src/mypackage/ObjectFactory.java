
package mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDistance_QNAME = new QName("http://example/", "getDistance");
    private final static QName _GetDistanceResponse_QNAME = new QName("http://example/", "getDistanceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDistance }
     * 
     */
    public GetDistance createGetDistance() {
        return new GetDistance();
    }

    /**
     * Create an instance of {@link GetDistanceResponse }
     * 
     */
    public GetDistanceResponse createGetDistanceResponse() {
        return new GetDistanceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDistance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "getDistance")
    public JAXBElement<GetDistance> createGetDistance(GetDistance value) {
        return new JAXBElement<GetDistance>(_GetDistance_QNAME, GetDistance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDistanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "getDistanceResponse")
    public JAXBElement<GetDistanceResponse> createGetDistanceResponse(GetDistanceResponse value) {
        return new JAXBElement<GetDistanceResponse>(_GetDistanceResponse_QNAME, GetDistanceResponse.class, null, value);
    }

}

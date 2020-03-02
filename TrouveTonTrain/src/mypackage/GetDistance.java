
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getDistance complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getDistance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDistance", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3"
})
public class GetDistance {

    protected double arg0;
    protected double arg1;
    protected double arg2;
    protected double arg3;

    /**
     * Obtient la valeur de la propriété arg0.
     * 
     */
    public double getArg0() {
        return arg0;
    }

    /**
     * Définit la valeur de la propriété arg0.
     * 
     */
    public void setArg0(double value) {
        this.arg0 = value;
    }

    /**
     * Obtient la valeur de la propriété arg1.
     * 
     */
    public double getArg1() {
        return arg1;
    }

    /**
     * Définit la valeur de la propriété arg1.
     * 
     */
    public void setArg1(double value) {
        this.arg1 = value;
    }

    /**
     * Obtient la valeur de la propriété arg2.
     * 
     */
    public double getArg2() {
        return arg2;
    }

    /**
     * Définit la valeur de la propriété arg2.
     * 
     */
    public void setArg2(double value) {
        this.arg2 = value;
    }

    /**
     * Obtient la valeur de la propriété arg3.
     * 
     */
    public double getArg3() {
        return arg3;
    }

    /**
     * Définit la valeur de la propriété arg3.
     * 
     */
    public void setArg3(double value) {
        this.arg3 = value;
    }

}

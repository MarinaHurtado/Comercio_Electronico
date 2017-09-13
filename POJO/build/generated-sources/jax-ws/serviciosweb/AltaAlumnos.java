
package serviciosweb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AltaAlumnos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AltaAlumnos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arr_nomCampos" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="arr_datos" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltaAlumnos", propOrder = {
    "arrNomCampos",
    "arrDatos"
})
public class AltaAlumnos {

    @XmlElement(name = "arr_nomCampos", nillable = true)
    protected List<String> arrNomCampos;
    @XmlElement(name = "arr_datos", nillable = true)
    protected List<String> arrDatos;

    /**
     * Gets the value of the arrNomCampos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrNomCampos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrNomCampos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getArrNomCampos() {
        if (arrNomCampos == null) {
            arrNomCampos = new ArrayList<String>();
        }
        return this.arrNomCampos;
    }

    /**
     * Gets the value of the arrDatos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrDatos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrDatos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getArrDatos() {
        if (arrDatos == null) {
            arrDatos = new ArrayList<String>();
        }
        return this.arrDatos;
    }

}

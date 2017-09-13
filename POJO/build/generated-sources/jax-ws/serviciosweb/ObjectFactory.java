
package serviciosweb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviciosweb package. 
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

    private final static QName _AgregaAlumnoResponse_QNAME = new QName("http://serviciosweb/", "AgregaAlumnoResponse");
    private final static QName _AltaAlumnoResponse_QNAME = new QName("http://serviciosweb/", "AltaAlumnoResponse");
    private final static QName _AltaAlumnosResponse_QNAME = new QName("http://serviciosweb/", "AltaAlumnosResponse");
    private final static QName _AgregaAlumno_QNAME = new QName("http://serviciosweb/", "AgregaAlumno");
    private final static QName _AltaAlumnos_QNAME = new QName("http://serviciosweb/", "AltaAlumnos");
    private final static QName _AltaAlumno_QNAME = new QName("http://serviciosweb/", "AltaAlumno");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviciosweb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AltaAlumno }
     * 
     */
    public AltaAlumno createAltaAlumno() {
        return new AltaAlumno();
    }

    /**
     * Create an instance of {@link AltaAlumnos }
     * 
     */
    public AltaAlumnos createAltaAlumnos() {
        return new AltaAlumnos();
    }

    /**
     * Create an instance of {@link AgregaAlumno }
     * 
     */
    public AgregaAlumno createAgregaAlumno() {
        return new AgregaAlumno();
    }

    /**
     * Create an instance of {@link AltaAlumnosResponse }
     * 
     */
    public AltaAlumnosResponse createAltaAlumnosResponse() {
        return new AltaAlumnosResponse();
    }

    /**
     * Create an instance of {@link AltaAlumnoResponse }
     * 
     */
    public AltaAlumnoResponse createAltaAlumnoResponse() {
        return new AltaAlumnoResponse();
    }

    /**
     * Create an instance of {@link AgregaAlumnoResponse }
     * 
     */
    public AgregaAlumnoResponse createAgregaAlumnoResponse() {
        return new AgregaAlumnoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregaAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviciosweb/", name = "AgregaAlumnoResponse")
    public JAXBElement<AgregaAlumnoResponse> createAgregaAlumnoResponse(AgregaAlumnoResponse value) {
        return new JAXBElement<AgregaAlumnoResponse>(_AgregaAlumnoResponse_QNAME, AgregaAlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviciosweb/", name = "AltaAlumnoResponse")
    public JAXBElement<AltaAlumnoResponse> createAltaAlumnoResponse(AltaAlumnoResponse value) {
        return new JAXBElement<AltaAlumnoResponse>(_AltaAlumnoResponse_QNAME, AltaAlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaAlumnosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviciosweb/", name = "AltaAlumnosResponse")
    public JAXBElement<AltaAlumnosResponse> createAltaAlumnosResponse(AltaAlumnosResponse value) {
        return new JAXBElement<AltaAlumnosResponse>(_AltaAlumnosResponse_QNAME, AltaAlumnosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregaAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviciosweb/", name = "AgregaAlumno")
    public JAXBElement<AgregaAlumno> createAgregaAlumno(AgregaAlumno value) {
        return new JAXBElement<AgregaAlumno>(_AgregaAlumno_QNAME, AgregaAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaAlumnos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviciosweb/", name = "AltaAlumnos")
    public JAXBElement<AltaAlumnos> createAltaAlumnos(AltaAlumnos value) {
        return new JAXBElement<AltaAlumnos>(_AltaAlumnos_QNAME, AltaAlumnos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviciosweb/", name = "AltaAlumno")
    public JAXBElement<AltaAlumno> createAltaAlumno(AltaAlumno value) {
        return new JAXBElement<AltaAlumno>(_AltaAlumno_QNAME, AltaAlumno.class, null, value);
    }

}

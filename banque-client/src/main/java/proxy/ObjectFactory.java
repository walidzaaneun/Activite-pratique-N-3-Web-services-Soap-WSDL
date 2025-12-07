
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ConvertionEuroEnDh_QNAME = new QName("http://webservice.walidzaaneun.com/", "convertionEuroEnDh");
    private static final QName _ConvertionEuroEnDhResponse_QNAME = new QName("http://webservice.walidzaaneun.com/", "convertionEuroEnDhResponse");
    private static final QName _GetCompte_QNAME = new QName("http://webservice.walidzaaneun.com/", "getCompte");
    private static final QName _GetCompteResponse_QNAME = new QName("http://webservice.walidzaaneun.com/", "getCompteResponse");
    private static final QName _GetComptes_QNAME = new QName("http://webservice.walidzaaneun.com/", "getComptes");
    private static final QName _GetComptesResponse_QNAME = new QName("http://webservice.walidzaaneun.com/", "getComptesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertionEuroEnDh }
     * 
     * @return
     *     the new instance of {@link ConvertionEuroEnDh }
     */
    public ConvertionEuroEnDh createConvertionEuroEnDh() {
        return new ConvertionEuroEnDh();
    }

    /**
     * Create an instance of {@link ConvertionEuroEnDhResponse }
     * 
     * @return
     *     the new instance of {@link ConvertionEuroEnDhResponse }
     */
    public ConvertionEuroEnDhResponse createConvertionEuroEnDhResponse() {
        return new ConvertionEuroEnDhResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     * @return
     *     the new instance of {@link GetCompte }
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteResponse }
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     * @return
     *     the new instance of {@link GetComptes }
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     * @return
     *     the new instance of {@link GetComptesResponse }
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertionEuroEnDh }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertionEuroEnDh }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.walidzaaneun.com/", name = "convertionEuroEnDh")
    public JAXBElement<ConvertionEuroEnDh> createConvertionEuroEnDh(ConvertionEuroEnDh value) {
        return new JAXBElement<>(_ConvertionEuroEnDh_QNAME, ConvertionEuroEnDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertionEuroEnDhResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertionEuroEnDhResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.walidzaaneun.com/", name = "convertionEuroEnDhResponse")
    public JAXBElement<ConvertionEuroEnDhResponse> createConvertionEuroEnDhResponse(ConvertionEuroEnDhResponse value) {
        return new JAXBElement<>(_ConvertionEuroEnDhResponse_QNAME, ConvertionEuroEnDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.walidzaaneun.com/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.walidzaaneun.com/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.walidzaaneun.com/", name = "getComptes")
    public JAXBElement<GetComptes> createGetComptes(GetComptes value) {
        return new JAXBElement<>(_GetComptes_QNAME, GetComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.walidzaaneun.com/", name = "getComptesResponse")
    public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse value) {
        return new JAXBElement<>(_GetComptesResponse_QNAME, GetComptesResponse.class, null, value);
    }

}

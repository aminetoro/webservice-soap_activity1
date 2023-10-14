
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private static final QName _ConvertMadtoEuro_QNAME = new QName("http://ws/", "ConvertMadtoEuro");
    private static final QName _ConvertMadtoEuroResponse_QNAME = new QName("http://ws/", "ConvertMadtoEuroResponse");
    private static final QName _GetCompte_QNAME = new QName("http://ws/", "getCompte");
    private static final QName _GetCompteResponse_QNAME = new QName("http://ws/", "getCompteResponse");
    private static final QName _GetListComptes_QNAME = new QName("http://ws/", "getListComptes");
    private static final QName _GetListComptesResponse_QNAME = new QName("http://ws/", "getListComptesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertMadtoEuro }
     * 
     * @return
     *     the new instance of {@link ConvertMadtoEuro }
     */
    public ConvertMadtoEuro createConvertMadtoEuro() {
        return new ConvertMadtoEuro();
    }

    /**
     * Create an instance of {@link ConvertMadtoEuroResponse }
     * 
     * @return
     *     the new instance of {@link ConvertMadtoEuroResponse }
     */
    public ConvertMadtoEuroResponse createConvertMadtoEuroResponse() {
        return new ConvertMadtoEuroResponse();
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
     * Create an instance of {@link GetListComptes }
     * 
     * @return
     *     the new instance of {@link GetListComptes }
     */
    public GetListComptes createGetListComptes() {
        return new GetListComptes();
    }

    /**
     * Create an instance of {@link GetListComptesResponse }
     * 
     * @return
     *     the new instance of {@link GetListComptesResponse }
     */
    public GetListComptesResponse createGetListComptesResponse() {
        return new GetListComptesResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertMadtoEuro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertMadtoEuro }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConvertMadtoEuro")
    public JAXBElement<ConvertMadtoEuro> createConvertMadtoEuro(ConvertMadtoEuro value) {
        return new JAXBElement<>(_ConvertMadtoEuro_QNAME, ConvertMadtoEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertMadtoEuroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertMadtoEuroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConvertMadtoEuroResponse")
    public JAXBElement<ConvertMadtoEuroResponse> createConvertMadtoEuroResponse(ConvertMadtoEuroResponse value) {
        return new JAXBElement<>(_ConvertMadtoEuroResponse_QNAME, ConvertMadtoEuroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompte")
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
    @XmlElementDecl(namespace = "http://ws/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getListComptes")
    public JAXBElement<GetListComptes> createGetListComptes(GetListComptes value) {
        return new JAXBElement<>(_GetListComptes_QNAME, GetListComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListComptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListComptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getListComptesResponse")
    public JAXBElement<GetListComptesResponse> createGetListComptesResponse(GetListComptesResponse value) {
        return new JAXBElement<>(_GetListComptesResponse_QNAME, GetListComptesResponse.class, null, value);
    }

}

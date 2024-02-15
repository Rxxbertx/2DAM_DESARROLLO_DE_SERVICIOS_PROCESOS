
package soap;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.server package. 
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

    private final static QName _Call_QNAME = new QName("http://server.soap/", "call");
    private final static QName _CallResponse_QNAME = new QName("http://server.soap/", "callResponse");
    private final static QName _GetFibonacci_QNAME = new QName("http://server.soap/", "getFibonacci");
    private final static QName _GetFibonacciResponse_QNAME = new QName("http://server.soap/", "getFibonacciResponse");
    private final static QName _GetGreating_QNAME = new QName("http://server.soap/", "getGreating");
    private final static QName _GetGreatingResponse_QNAME = new QName("http://server.soap/", "getGreatingResponse");
    private final static QName _GetSuma_QNAME = new QName("http://server.soap/", "getSuma");
    private final static QName _GetSumaFibonacci_QNAME = new QName("http://server.soap/", "getSumaFibonacci");
    private final static QName _GetSumaFibonacciResponse_QNAME = new QName("http://server.soap/", "getSumaFibonacciResponse");
    private final static QName _GetSumaResponse_QNAME = new QName("http://server.soap/", "getSumaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Call }
     * 
     * @return
     *     the new instance of {@link Call }
     */
    public Call createCall() {
        return new Call();
    }

    /**
     * Create an instance of {@link CallResponse }
     * 
     * @return
     *     the new instance of {@link CallResponse }
     */
    public CallResponse createCallResponse() {
        return new CallResponse();
    }

    /**
     * Create an instance of {@link GetFibonacci }
     * 
     * @return
     *     the new instance of {@link GetFibonacci }
     */
    public GetFibonacci createGetFibonacci() {
        return new GetFibonacci();
    }

    /**
     * Create an instance of {@link GetFibonacciResponse }
     * 
     * @return
     *     the new instance of {@link GetFibonacciResponse }
     */
    public GetFibonacciResponse createGetFibonacciResponse() {
        return new GetFibonacciResponse();
    }

    /**
     * Create an instance of {@link GetGreating }
     * 
     * @return
     *     the new instance of {@link GetGreating }
     */
    public GetGreating createGetGreating() {
        return new GetGreating();
    }

    /**
     * Create an instance of {@link GetGreatingResponse }
     * 
     * @return
     *     the new instance of {@link GetGreatingResponse }
     */
    public GetGreatingResponse createGetGreatingResponse() {
        return new GetGreatingResponse();
    }

    /**
     * Create an instance of {@link GetSuma }
     * 
     * @return
     *     the new instance of {@link GetSuma }
     */
    public GetSuma createGetSuma() {
        return new GetSuma();
    }

    /**
     * Create an instance of {@link GetSumaFibonacci }
     * 
     * @return
     *     the new instance of {@link GetSumaFibonacci }
     */
    public GetSumaFibonacci createGetSumaFibonacci() {
        return new GetSumaFibonacci();
    }

    /**
     * Create an instance of {@link GetSumaFibonacciResponse }
     * 
     * @return
     *     the new instance of {@link GetSumaFibonacciResponse }
     */
    public GetSumaFibonacciResponse createGetSumaFibonacciResponse() {
        return new GetSumaFibonacciResponse();
    }

    /**
     * Create an instance of {@link GetSumaResponse }
     * 
     * @return
     *     the new instance of {@link GetSumaResponse }
     */
    public GetSumaResponse createGetSumaResponse() {
        return new GetSumaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Call }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Call }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.soap/", name = "call")
    public JAXBElement<Call> createCall(Call value) {
        return new JAXBElement<>(_Call_QNAME, Call.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CallResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.soap/", name = "callResponse")
    public JAXBElement<CallResponse> createCallResponse(CallResponse value) {
        return new JAXBElement<>(_CallResponse_QNAME, CallResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFibonacci }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFibonacci }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.soap/", name = "getFibonacci")
    public JAXBElement<GetFibonacci> createGetFibonacci(GetFibonacci value) {
        return new JAXBElement<>(_GetFibonacci_QNAME, GetFibonacci.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFibonacciResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFibonacciResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.soap/", name = "getFibonacciResponse")
    public JAXBElement<GetFibonacciResponse> createGetFibonacciResponse(GetFibonacciResponse value) {
        return new JAXBElement<>(_GetFibonacciResponse_QNAME, GetFibonacciResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGreating }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGreating }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.soap/", name = "getGreating")
    public JAXBElement<GetGreating> createGetGreating(GetGreating value) {
        return new JAXBElement<>(_GetGreating_QNAME, GetGreating.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGreatingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGreatingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.soap/", name = "getGreatingResponse")
    public JAXBElement<GetGreatingResponse> createGetGreatingResponse(GetGreatingResponse value) {
        return new JAXBElement<>(_GetGreatingResponse_QNAME, GetGreatingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSuma }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSuma }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.soap/", name = "getSuma")
    public JAXBElement<GetSuma> createGetSuma(GetSuma value) {
        return new JAXBElement<>(_GetSuma_QNAME, GetSuma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSumaFibonacci }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSumaFibonacci }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.soap/", name = "getSumaFibonacci")
    public JAXBElement<GetSumaFibonacci> createGetSumaFibonacci(GetSumaFibonacci value) {
        return new JAXBElement<>(_GetSumaFibonacci_QNAME, GetSumaFibonacci.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSumaFibonacciResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSumaFibonacciResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.soap/", name = "getSumaFibonacciResponse")
    public JAXBElement<GetSumaFibonacciResponse> createGetSumaFibonacciResponse(GetSumaFibonacciResponse value) {
        return new JAXBElement<>(_GetSumaFibonacciResponse_QNAME, GetSumaFibonacciResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSumaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSumaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.soap/", name = "getSumaResponse")
    public JAXBElement<GetSumaResponse> createGetSumaResponse(GetSumaResponse value) {
        return new JAXBElement<>(_GetSumaResponse_QNAME, GetSumaResponse.class, null, value);
    }

}

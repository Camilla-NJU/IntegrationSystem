
package ws.banksystem;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BankImplService", targetNamespace = "http://banksystem/", wsdlLocation = "http://192.168.43.49:8081/banksystem?wsdl")
public class BankImplService
    extends Service
{

    private final static URL BANKIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException BANKIMPLSERVICE_EXCEPTION;
    private final static QName BANKIMPLSERVICE_QNAME = new QName("http://banksystem/", "BankImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.43.49:8081/banksystem?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKIMPLSERVICE_WSDL_LOCATION = url;
        BANKIMPLSERVICE_EXCEPTION = e;
    }

    public BankImplService() {
        super(__getWsdlLocation(), BANKIMPLSERVICE_QNAME);
    }

    public BankImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKIMPLSERVICE_QNAME, features);
    }

    public BankImplService(URL wsdlLocation) {
        super(wsdlLocation, BANKIMPLSERVICE_QNAME);
    }

    public BankImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKIMPLSERVICE_QNAME, features);
    }

    public BankImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Bank
     */
    @WebEndpoint(name = "BankImplPort")
    public Bank getBankImplPort() {
        return super.getPort(new QName("http://banksystem/", "BankImplPort"), Bank.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Bank
     */
    @WebEndpoint(name = "BankImplPort")
    public Bank getBankImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://banksystem/", "BankImplPort"), Bank.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKIMPLSERVICE_EXCEPTION!= null) {
            throw BANKIMPLSERVICE_EXCEPTION;
        }
        return BANKIMPLSERVICE_WSDL_LOCATION;
    }

}

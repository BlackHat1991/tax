
package bulkItrService;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BulkItrService", targetNamespace = "http://incometaxindiaefiling.gov.in/ditsecws", wsdlLocation = "https://services.incometaxindiaefiling.gov.in/e-FilingSecWS/ditsecws/BulkItrService?wsdl")
public class BulkItrService_Service
    extends Service
{

    private final static URL BULKITRSERVICE_WSDL_LOCATION;
    private final static WebServiceException BULKITRSERVICE_EXCEPTION;
    private final static QName BULKITRSERVICE_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws", "BulkItrService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://services.incometaxindiaefiling.gov.in/e-FilingSecWS/ditsecws/BulkItrService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BULKITRSERVICE_WSDL_LOCATION = url;
        BULKITRSERVICE_EXCEPTION = e;
    }

    public BulkItrService_Service() {
        super(__getWsdlLocation(), BULKITRSERVICE_QNAME);
    }

    public BulkItrService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BULKITRSERVICE_QNAME, features);
    }

    public BulkItrService_Service(URL wsdlLocation) {
        super(wsdlLocation, BULKITRSERVICE_QNAME);
    }

    public BulkItrService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BULKITRSERVICE_QNAME, features);
    }

    public BulkItrService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BulkItrService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BulkItrService
     */
    @WebEndpoint(name = "BulkItrServicePort")
    public BulkItrService getBulkItrServicePort() {
        return super.getPort(new QName("http://incometaxindiaefiling.gov.in/ditsecws", "BulkItrServicePort"), BulkItrService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BulkItrService
     */
    @WebEndpoint(name = "BulkItrServicePort")
    public BulkItrService getBulkItrServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://incometaxindiaefiling.gov.in/ditsecws", "BulkItrServicePort"), BulkItrService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BULKITRSERVICE_EXCEPTION!= null) {
            throw BULKITRSERVICE_EXCEPTION;
        }
        return BULKITRSERVICE_WSDL_LOCATION;
    }

}


package bulkPanService;

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
@WebServiceClient(name = "BulkPanService", targetNamespace = "http://incometaxindiaefiling.gov.in/ditsecws", wsdlLocation = "https://services.incometaxindiaefiling.gov.in/e-FilingSecWS/ditsecws/BulkPanService?wsdl")
public class BulkPanService_Service
    extends Service
{

    private final static URL BULKPANSERVICE_WSDL_LOCATION;
    private final static WebServiceException BULKPANSERVICE_EXCEPTION;
    private final static QName BULKPANSERVICE_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws", "BulkPanService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://services.incometaxindiaefiling.gov.in/e-FilingSecWS/ditsecws/BulkPanService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BULKPANSERVICE_WSDL_LOCATION = url;
        BULKPANSERVICE_EXCEPTION = e;
    }

    public BulkPanService_Service() {
        super(__getWsdlLocation(), BULKPANSERVICE_QNAME);
    }

    public BulkPanService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BULKPANSERVICE_QNAME, features);
    }

    public BulkPanService_Service(URL wsdlLocation) {
        super(wsdlLocation, BULKPANSERVICE_QNAME);
    }

    public BulkPanService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BULKPANSERVICE_QNAME, features);
    }

    public BulkPanService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BulkPanService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BulkPanService
     */
    @WebEndpoint(name = "BulkPanServicePort")
    public BulkPanService getBulkPanServicePort() {
        return super.getPort(new QName("http://incometaxindiaefiling.gov.in/ditsecws", "BulkPanServicePort"), BulkPanService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BulkPanService
     */
    @WebEndpoint(name = "BulkPanServicePort")
    public BulkPanService getBulkPanServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://incometaxindiaefiling.gov.in/ditsecws", "BulkPanServicePort"), BulkPanService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BULKPANSERVICE_EXCEPTION!= null) {
            throw BULKPANSERVICE_EXCEPTION;
        }
        return BULKPANSERVICE_WSDL_LOCATION;
    }

}

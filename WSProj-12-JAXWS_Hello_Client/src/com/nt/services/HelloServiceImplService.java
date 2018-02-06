
package com.nt.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_02-b08-fcs
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "HelloServiceImplService", targetNamespace = "http://services.nt.com/", wsdlLocation = "http://localhost:3030/WSProj-11-JAXWS-RI-Serverside-Hello/hello?wsdl")
public class HelloServiceImplService
    extends Service
{

    private final static URL HELLOSERVICEIMPLSERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:3030/WSProj-11-JAXWS-RI-Serverside-Hello/hello?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HELLOSERVICEIMPLSERVICE_WSDL_LOCATION = url;
    }

    public HelloServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloServiceImplService() {
        super(HELLOSERVICEIMPLSERVICE_WSDL_LOCATION, new QName("http://services.nt.com/", "HelloServiceImplService"));
    }

    /**
     * 
     * @return
     *     returns HelloServiceImpl
     */
    @WebEndpoint(name = "HelloServiceImplPort")
    public HelloServiceImpl getHelloServiceImplPort() {
        return (HelloServiceImpl)super.getPort(new QName("http://services.nt.com/", "HelloServiceImplPort"), HelloServiceImpl.class);
    }

}
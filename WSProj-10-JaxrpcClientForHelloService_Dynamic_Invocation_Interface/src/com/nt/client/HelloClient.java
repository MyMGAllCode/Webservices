package com.nt.client;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;

public class HelloClient {
public static void main(String[] args) throws ServiceException, RemoteException {
	String serviceName="Hello";
	String tns="http://service.jaxrpc.com/wsdl";
	String portName="IHelloServicePort";
	String  wsdl="http://localhost:3030/WSProj-4-JAXRPC_SI_Example/hello?WSDL";
	ServiceFactory factory=ServiceFactory.newInstance();
	Service service=factory.createService(new QName(tns,serviceName));
	Call call=service.createCall(new QName(tns,portName));
	call.setTargetEndpointAddress(wsdl);//Wsdl Location 
	call.setProperty(call.SOAPACTION_URI_PROPERTY, "");
	call.setProperty(call.ENCODINGSTYLE_URI_PROPERTY, "http://schemas.xmlsoap.org/soap/encoding");
	
	
	String xsd_ns="http://www.w3.org/2001/XMLSchema";
	
	
	call.addParameter("String_1", new QName(xsd_ns,"string"),ParameterMode.IN);
	call.setOperationName(new QName(tns,"sayHello"));
	call.setReturnType(new QName(xsd_ns,"string"));
	String msg=(String) call.invoke(new Object[]{"Dharmendra"});
	
	
}
}

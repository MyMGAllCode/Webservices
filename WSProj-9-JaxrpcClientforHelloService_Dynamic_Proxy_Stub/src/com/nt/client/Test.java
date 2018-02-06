package com.nt.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;

public class Test {
	public static void main(String[] args) throws MalformedURLException, ServiceException, RemoteException {
		
		
		
		
		ServiceFactory factory=ServiceFactory.newInstance();
		
		
		String tns="http://service.jaxrpc.com/wsdl";
		
		
		String serviceName="Hello";
		
		URL wsdl=new URL("http://localhost:3030/WSProj-4-JAXRPC_SI_Example/hello?WSDL");
		String portName="IHelloServicePort";
		//Get Service Object from ServiceFactory
		Service service=factory.createService(wsdl,new QName(tns,serviceName));
	//IHelloService sei=(IHelloService) service.getPort(new QName(tns,serviceName), IHelloService.class);//iterator
		IHelloService sei=(IHelloService) service.getPort(new QName(tns,portName), IHelloService.class);//iterator
	//String data=sei.sayHello("Dharmendra");
			System.out.println(sei.sayHello("Helllo"));
		
		
	}

}

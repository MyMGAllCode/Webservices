package com.nareshit.domain;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshallerTest1 {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEnpNo(1002);
		emp.setName("Dharmendra");
		emp.setSalary(60000);
		
		try {
			JAXBContext jaxbContext=JAXBContext.newInstance(Employee.class);
		
			Marshaller marshaller=jaxbContext.createMarshaller();
			
		StringWriter writer=new StringWriter();
			marshaller.marshal(emp, writer);
			String xml=writer.toString();
			System.out.println("Java Object is converted into \n XML Fortmat and Displying as String not in Xml File"+xml);
			
		
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}


}

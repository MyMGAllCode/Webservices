package com.nareshit.domain;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshallerTest {
	public static void main(String[] args) {
Employee emp=new Employee();
emp.setEnpNo(1001);
emp.setName("Dharmendra");
emp.setSalary(50000);



try {
	JAXBContext jaxbContext=JAXBContext.newInstance(Employee.class);
Marshaller marshaller=jaxbContext.createMarshaller();
marshaller.marshal(emp, new File("employee.xml"));

} catch (JAXBException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}

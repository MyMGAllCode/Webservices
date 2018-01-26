package com.nareshit.domain;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/*
	This Class is use for  Unmarshalling means XML format to java Object 
format
 
  
  */
public class UnMarshallerTest {
	public static void main(String[] args) {
		try
		{
		JAXBContext jaxbContext =JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
		Employee emp=(Employee)unmarshaller.unmarshal(new File("employee.xml"));
		
	System.out.println(emp.getEnpNo()+","+emp.getName()+","+emp.getSalary());
		}
		catch(JAXBException e)
		{
			e.printStackTrace();
		}
	}

}

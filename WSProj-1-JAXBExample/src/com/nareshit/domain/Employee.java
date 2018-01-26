package com.nareshit.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// Program for Java to XML format Conversion means Marshalling  
//This is called biding class 

//Conversion  of this java class obj int xml data format we will use MarshallerTest.java 

//Using Annotations setting Root element 
@XmlRootElement(name="employee")
public class Employee {
	private int  enpNo;
	private String name;
	private double salary;
	
	////////Getters and Setters
	
	@XmlAttribute(name="empNo")
	public int getEnpNo() {
		return enpNo;
	}
	public void setEnpNo(int enpNo) {
		this.enpNo = enpNo;
	}
	
	@XmlElement(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement(name="salary")
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}

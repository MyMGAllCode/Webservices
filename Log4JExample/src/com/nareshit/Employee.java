package com.nareshit;

import org.apache.log4j.Logger;

public class Employee {
	private static Logger logger=Logger.getLogger("com.nareshit.Emplyoee.class");
	
	
	  static int empno;
	static  String name;
	static  String email;
	 
	 public void setEmployeeInfo(int empno,String name,String email){
		logger.error("setEmployeeInfo method execute by Error");
		this.empno=empno;
		this.name=name;
		this.email=email;
		logger.warn("Method end warm method called");
		logger.debug("Debug Method called");
		logger.fatal("Fatal Method is called");
		
		 
		 
	 }
public static void main(String[] args) {
	
	 logger.info("Info Method called: Main Method executed ");
	 Employee emp=new Employee();
	 emp.setEmployeeInfo(1001,"Dharmendra", "DKP@GMAIL");
	 
	 logger.info("Info Method called: Main Method ended ");
	 
	 logger.info("Info Method called: Display Emp Details ");
	 System.out.println("Employee No:"+empno+"Emp Name:"+name+"Emp Email:"+email);
	
}

}

package com.nareshit.test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.nareshit.domain.Employee;
import com.nt.JsonUtility.JsonUtil;

public class Test {
public static void main(String[] args) throws IOException {
	Employee emp =new Employee();
	emp.setEid(10001);
	emp.setAdd("Hyderabad");
	emp.setName("Dharmendra");
	String json=JsonUtil.javaToJson(emp);
	
	System.out.println("Json Format "+JsonUtil.javaToJson(emp));
	
	System.out.println("Java Object Format "+JsonUtil.jsonToJava(json));
}
}

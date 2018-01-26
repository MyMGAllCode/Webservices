package com.nt.test;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JavaToJsonTest {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Employee emp=new Employee();
		emp.setEid(1001);
		emp.setName("Dharmendra");
		emp.setAdd("Bhopal");
		System.out.println(emp);
		
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writeValueAsString(emp);
		System.out.println("Json format of employee obj\n"+json);
		
		Employee employee=mapper.readValue(json, Employee.class);
		System.out.println("Json Format to Java Obj Format \n"+employee.getEid()+" "+employee.getName()+" "+employee.getAdd());
	}

}

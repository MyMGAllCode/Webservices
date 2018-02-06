package com.nt.client;

import com.nt.services.HelloServiceImpl;
import com.nt.services.HelloServiceImplService;

public class Test {
	public static void main(String[] args) {
		HelloServiceImplService service=new HelloServiceImplService();
		HelloServiceImpl sei=service.getHelloServiceImplPort();
		String msg=sei.sayHello(" Dharmendra  ");
		
		System.out.println(msg);
		
	}

}

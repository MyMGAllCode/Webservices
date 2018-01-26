package com.jaxrpc.service;

public class HelloServiceImpl implements IHelloService{

	@Override
	public String sayHello(String name) {
	String msg="Hello"+name+"Welcome to Webservices First Program::\n Implementing JAXRPC-SI";
		return msg;
	}

}

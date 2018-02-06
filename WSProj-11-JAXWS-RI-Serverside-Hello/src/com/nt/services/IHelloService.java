package com.nt.services;

import javax.jws.WebService;

@WebService
public interface IHelloService {
	public String SayHello(String name);
	

}

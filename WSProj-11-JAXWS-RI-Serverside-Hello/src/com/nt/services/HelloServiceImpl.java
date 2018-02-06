/**
 * 
 */
package com.nt.services;

import javax.jws.WebService;

/**
 * @author DKP
 *
 */
@WebService
public class HelloServiceImpl implements IHelloService {

	public String SayHello(String name) {
		
		String msg="Hello"+name+"Welcome to First JAXWS Webservices Server Side Program";
		
		return msg;
	}

}

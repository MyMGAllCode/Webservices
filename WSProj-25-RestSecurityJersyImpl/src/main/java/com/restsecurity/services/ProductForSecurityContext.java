package com.restsecurity.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

@Path("product1")
public class ProductForSecurityContext {

	@GET
	@Path("/getProduct1")
	@Produces(MediaType.TEXT_PLAIN)
	public String getProduct(@QueryParam("pid") String pid, @Context SecurityContext sc) {
		System.out.println("Method Called");
		if (sc.isUserInRole("customer")) {

			if (pid != null && pid.equals(301)) 

				return "KEYBOARD";
	
			else 
				
		return "Product is not Found";
		}
		return "outer side";
	}// method
}// class

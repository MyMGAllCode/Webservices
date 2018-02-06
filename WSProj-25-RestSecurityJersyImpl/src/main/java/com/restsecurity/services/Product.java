package com.restsecurity.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("product")
public class Product {
	@GET
	@Path("/getProduct")
	@Produces(MediaType.TEXT_PLAIN)
	public String getProduct(@QueryParam("pid") String pid){
		System.out.println("Method Called");
		if(pid!=null&&pid.equals(301))
		{
		
		return "KEYBOARD";
		}
		else
		return "Product is not Found";
		
	}

}

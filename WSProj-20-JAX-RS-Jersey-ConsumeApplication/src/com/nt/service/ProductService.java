package com.nt.service;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("products")
public class ProductService {
	@GET
	@Path("registerProduct")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_XML)
	
public String registerProduct(String ProductXML){
		
		//Write The logic to Register Product Detail here 
		
		System.out.println("Server side Code Executed Successfully ");
		
		return "Product Registration is completed  Successfully";
		
	}
	
	

}

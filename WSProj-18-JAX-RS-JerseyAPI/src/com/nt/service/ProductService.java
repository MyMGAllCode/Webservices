package com.nt.service;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.domain.Product;

@Path("product")
public class ProductService {
	@GET
	@Path("getProduct")
	@Produces(MediaType.APPLICATION_XML)
	public Product getProduct(){
		Product product =new Product();
		product.setPid(1001111);
		product.setPname("Abishek");
		product.setPrice(300000000000000.0);
		return product;
	
	}

}

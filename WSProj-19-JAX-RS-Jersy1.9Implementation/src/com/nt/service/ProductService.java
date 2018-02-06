package com.nt.service;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.nt.domain.Product;


@Path("product")
public class ProductService {
	
	//Using @QueryParam Annotation
	
	@GET
	@Path("getProductQueryParam")
	
	@Produces(MediaType.APPLICATION_XML)
	public Product getProductQueryParam(@QueryParam("pid") Integer pid,@QueryParam("pname") String pname)
	{
		Product p=new Product();
	if(pid!=null&&pid.equals(102)){	
		p.setPid(pid);
		p.setPname(pname);
		p.setPrice(300.0);
		return p;
		
	}
return p;

		
	}
	
	//Using @PathParam Annotation . In this Annotation In @Path "getProductPathParam/{pid}/{pname}", /{pid}/{pname} is mandatory  
	
	@GET
	@Path("getProductPathParam/{pid}/{pname}")
	
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProductPathParam(@PathParam("pid") Integer pid,@PathParam("pname") String pname)
	{
		Product p=new Product();
	if(pid!=null&&pid.equals(101)){	
		p.setPid(pid);
		p.setPname(pname);
		p.setPrice(300.0);
		return p;
		
	}
return p;
		
	}
	
	
	
	//Using @MatrixParam Annotation . In this Annotation In @Path "getProductPathParam/{pid}/{pname}", /{pid}/{pname} is mandatory  
	
		@GET
		@Path("getProductMatrixParam")
		
		@Produces(MediaType.APPLICATION_JSON)
		public Product getProductMatrixParam(@MatrixParam("pid") Integer pid,@MatrixParam("pname") String pname)
		{
			Product p=new Product();
		if(pid!=null&&pid.equals(101)){	
			p.setPid(pid);
			p.setPname(pname);
			p.setPrice(300.0);
			return p;
			
		}
	return p;
			
		}
		
	
	

}

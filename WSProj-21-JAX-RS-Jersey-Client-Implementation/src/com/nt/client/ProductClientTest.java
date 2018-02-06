package com.nt.client;

import java.io.StringWriter;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class ProductClientTest {

	public static void main(String[] args) throws JAXBException {
		String URL="http://localhost:4040/WSProj-20-JAX-RS-Jersey-ConsumeApplication/products/registerProduct";
		
		Client client=Client.create();
		
		WebResource webResource=client.resource(URL);
		Builder builder=webResource.type(MediaType.APPLICATION_XML);
		builder.accept(MediaType.TEXT_PLAIN);
		
		Product product=new Product();
		product.setPid(1001);
		product.setPname("Mouse");
		product.setPrice("300");
		
		JAXBContext jaxbcontext= JAXBContext.newInstance(Product.class);
		Marshaller marshaller=jaxbcontext.createMarshaller();
		StringWriter writer=new StringWriter();
		marshaller.marshal(product, writer);
		String productXML=writer.toString();
		//System.out.println("builder.post is going to executed ");
		ClientResponse clientResponse=builder.post(ClientResponse.class, productXML);
		//System.out.println("builder.post is executed ");
		String response=clientResponse.getEntity(String.class);
		System.out.println(clientResponse.getStatus()+""+clientResponse.getStatusInfo());
		System.out.println(response);
		
		
		
		
	}

}

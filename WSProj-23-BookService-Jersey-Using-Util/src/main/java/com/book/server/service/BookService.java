package com.book.server.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.book.server.dao.BookDAO;
import com.book.server.dao.BookDAOFactory;
import com.bookutil.domain.Book;
import com.bookutil.domain.ResponseDTO;
import com.bookutil.jsonUtil.JsonUtil;

@Path("bookService")
public class BookService {
	ResponseDTO resDTO = new ResponseDTO();
	BookDAO bookDAO = BookDAOFactory.getInstance();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("registerBook")
	public 	String registerBook(String jsonBook) {
		String responseJson="";
		Book book = JsonUtil.jsonToJava(Book.class, jsonBook);
		int count = bookDAO.registerBook(book);
		if (count > 0) {
			
			resDTO.setMsg("Book Registration is Successfully Done!!!");
			resDTO.setData(book.getIsbn().toString());
		resDTO.setStatus("Success");

		}
		
		responseJson=JsonUtil.javaToJson(resDTO);
		
return responseJson;
	}

}

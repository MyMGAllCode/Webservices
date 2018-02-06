package com.book.server.dao;

public class BookDAOFactory {
	
	public static BookDAO getInstance(){
		 
		
		
		return new BookDAOImpl();
		
	}

}

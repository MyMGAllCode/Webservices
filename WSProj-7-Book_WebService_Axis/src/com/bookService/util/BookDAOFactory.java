package com.bookService.util;

import com.bookService.dao.BookDAO;
import com.bookService.dao.BookDAOImpl;

public class BookDAOFactory {
	private static BookDAO bookDAO=null;
	static{
		bookDAO=new BookDAOImpl();
		
	}
	public static BookDAO getBookDAO(){
	return bookDAO;
	}
	
	

}

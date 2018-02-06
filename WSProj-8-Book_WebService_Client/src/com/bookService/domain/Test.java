package com.bookService.domain;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.bookService.sevices.BookServiceImpl;
import com.bookService.sevices.BookServiceImplServiceLocator;

public class Test {
	public static void main(String[] args) throws ServiceException, RemoteException {
		BookServiceImplServiceLocator bookServiceImplServiceLocator=new BookServiceImplServiceLocator();
		
		BookServiceImpl sei=bookServiceImplServiceLocator.getBookServiceImpl();
		
		Book book=sei.searchBook(1001);
		System.out.println("\n"+book.getTitle()+"\n"+book.getAuthor()+"\n"+book.getPrice());
		
		
	}

}

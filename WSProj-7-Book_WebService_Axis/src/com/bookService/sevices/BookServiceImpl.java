package com.bookService.sevices;

import java.rmi.RemoteException;

import com.bookService.domain.Book;
import com.bookService.util.BookDAOFactory;

public class BookServiceImpl implements IBoookSerive {

	@Override
	public Book searchBook(int isbn) throws RemoteException {
		Book book=BookDAOFactory.getBookDAO().searchBook(isbn);
		return book;
	}

}

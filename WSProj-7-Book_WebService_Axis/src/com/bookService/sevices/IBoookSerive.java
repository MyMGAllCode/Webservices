package com.bookService.sevices;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.bookService.domain.Book;

public interface IBoookSerive extends Remote{
	public Book searchBook(int isbn) throws RemoteException; 

}

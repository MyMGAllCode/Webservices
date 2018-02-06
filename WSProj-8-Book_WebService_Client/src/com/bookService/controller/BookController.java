package com.bookService.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import com.bookService.domain.Book;
import com.bookService.sevices.BookServiceImpl;
import com.bookService.sevices.BookServiceImplServiceLocator;

public class BookController extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int isbn = Integer.parseInt(req.getParameter("isbn"));

		BookServiceImplServiceLocator blocator = new BookServiceImplServiceLocator();
		try {
			BookServiceImpl sei = blocator.getBookServiceImpl();
			Book book = sei.searchBook(isbn);
			req.setAttribute("BookData", book);
			RequestDispatcher rd = req.getRequestDispatcher("/output.jsp");
			rd.forward(req, res);

		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
@Override
public  void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	doGet(req,res);
}
}

package com.bookService.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookService.domain.Book;
import com.bookService.util.ConnectionFactoryUtil;
import com.bookService.util.SQLContraints;

public class BookDAOImpl implements BookDAO {
	Connection con=null;
	Book book=null;
	@Override
	public Book searchBook(int isbn) {
		
	
		 try {
			con=ConnectionFactoryUtil.getConnection();
		
			if(con!=null){
				
			
		PreparedStatement ps=con.prepareStatement(SQLContraints.SQL_SEARCH_BOOK);
		ps.setInt(1, isbn);
		ResultSet rs=ps.executeQuery();
	if(rs.next())
	{
		book=new Book();
		book.setIsbn(isbn);
		book.setTitle(rs.getString("title"));
		book.setAuthor(rs.getString("author"));
		book.setPrice(rs.getDouble("price"));
		
	}
		
	}
		 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(" Internal Proplem "+e.getMessage());
			}
		
	
		
		
		return book;
	}

}

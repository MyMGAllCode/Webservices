package com.book.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.book.server.util.ConnectionUtil;
import com.bookutil.domain.Book;

public class BookDAOImpl implements BookDAO {
	int count=0;
	@Override
	public int registerBook(Book book) {
		Connection conn=ConnectionUtil.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement("INSERT INTO BOOK_DETAILS VALUES(?,?,?,?,?)");
			ps.setInt(1, book.getIsbn());
			ps.setString(2, book.getTitle());
			ps.setString(3, book.getAuthor());
			ps.setDouble(4, book.getPrice());
			ps.setString(5, book.getPublication());
			
			count =ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return count;
	}

}

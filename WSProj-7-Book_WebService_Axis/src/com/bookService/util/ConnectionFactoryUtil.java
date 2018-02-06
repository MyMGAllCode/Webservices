package com.bookService.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryUtil {
static{
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Exception Occured at loading of driver"+e.getMessage());
		
	}
	
}
public static Connection getConnection() throws SQLException{
	System.out.println("Before Getting Connetion ");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
	System.out.println("After Getting Connetion ");
	
	return con;
}

}

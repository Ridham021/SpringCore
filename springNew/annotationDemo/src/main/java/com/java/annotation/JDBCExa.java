package com.java.annotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExa {
	
    public static void Main(String args[]) throws ClassNotFoundException, SQLException {
    	Class.forName("com.mysql.jdbc.Driver");  
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","admin","Ridham@1717");
    	
    	if(con != null) {
    		System.out.println("Database connected");
    	}
    }

}

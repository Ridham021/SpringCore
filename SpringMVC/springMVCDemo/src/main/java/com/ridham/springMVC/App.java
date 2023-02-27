package com.ridham.springMVC;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");  
    	Connection con=DriverManager.getConnection(  
    	"jdbc:mysql://localhost:3306/book_shop","admin","Ridham@1717");  
    	
    	Statement stmt = (Statement) con.createStatement();
    	
    		
    	ResultSet rs = stmt.executeQuery("select * from employees");
    	
    	while(rs.next()) {
    			int id=rs.getInt(1);
    			String name = rs.getString(2);
    			int Salary = rs.getInt(3);
    			
    			System.out.println(id+" "+name+" "+Salary);
    	}
    		
    	
    	
    	
    }
}

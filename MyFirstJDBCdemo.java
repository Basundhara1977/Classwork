package com.example;
import java.sql.*;
public class MyFirstJDBCdemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/acpcejava","root","Manibasu08");
		
			
	        Statement stmt=con.createStatement();
			
			//step 4 execute Statement
			
			int a=stmt.executeUpdate("insert into emp values(5,'Saksh','Mechanical',334545)");
			int b=stmt.executeUpdate("insert into emp values(9,'Rohan','Computer',564789)");
			
			System.out.println("Successfully added employee 1" +a);
			System.out.println("Successfully added employee 2" +b);
			 //step 5
			con.close();
	}

}

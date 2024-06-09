package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Secondjdbc {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		        
		        String driverClassName = "com.mysql.cj.jdbc.Driver";
		        String url = "jdbc:mysql://localhost:3306/acpcejava"; 
		        String username = "root";
		        String pass = "Manibasu08";
		        String query = "insert into students values(206, 'Piyali')"; 
		        
		            // Load Driver class
		            Class.forName(driverClassName);
		            
		            // Obtain a connection
		            Connection con = DriverManager.getConnection(url, username, pass);
		            
		            // Obtain a statement
		            Statement st = con.createStatement();
		            
		            // Execute the statement
		            int count = st.executeUpdate(query);
		            System.out.println("Number of rows affected by this query: " + count);
		            
		          //closing the connection as per 
		    	  //the requirements with connection is completed
		    		
		    		con.close();
		    		
		    

		}

	}



package com.example;
import java.sql.*;

public class Fistjdbc {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO Auto-generated method stub
        
        String driverClassName = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/acpcejava"; 
        String username = "root";
        String password = "Manibasu08";
        String query = "insert into students values(204, 'Swati')"; 
        
            // Load Driver class
            Class.forName(driverClassName);
            
            // Obtain a connection
            Connection con = DriverManager.getConnection(url, username, password);
            
            // Obtain a statement
            Statement st = con.createStatement();
            
            // Execute the statement
            int count = st.executeUpdate(query);
            System.out.println("Number of rows affected by this query: " + count);
            
            // Closing the connection
            con.close();
            
       
    }

}

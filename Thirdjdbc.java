package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Thirdjdbc {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");//step 1

        // Establish the connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acpcejava", "root", "Manibasu08");//step2

        // Create a statement
        Statement st = con.createStatement();

        // Execute the query
        ResultSet rs = st.executeQuery("select * from customer");
        int salary;
        String name, design, dept, id;
        System.out.println("Customer details");
        System.out.println("*************************");
        while (rs.next()) {
            id = rs.getString(1);
            name = rs.getString(2);
            design = rs.getString(3);
            dept = rs.getString(4);
            salary = rs.getInt(5);
            System.out.println(id + " | " + name + " | " + design + " | " + dept + " | " + salary);
        }
        con.close(); // close the connection
    }
}

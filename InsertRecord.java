package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecord {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish the database connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acpcejava", "root", "Manibasu08");

        // Prepare the SQL statement
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO CUSTOMER VALUES(?,?,?,?,?,?)");

        // Prompt user to enter employee details
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id:");
        String id = sc.next();

        System.out.println("Enter employee name:");
        String name = sc.next();

        System.out.println("Enter employee designation:");
        String design = sc.next();

        System.out.println("Enter employee department:");
        String dept = sc.next();

        System.out.println("Enter employee salary:");
        int salary = sc.nextInt();

        // Set parameters for the SQL statement
        pstmt.setString(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, design);
        pstmt.setString(4, dept);
        pstmt.setInt(5, salary);

        // Execute the SQL statement
        int rowsAffected = pstmt.executeUpdate();

        pstmt.close();
        con.close();

        System.out.println(rowsAffected + " record(s) added successfully!");
    }
}

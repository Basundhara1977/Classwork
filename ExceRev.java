package com.test;

public class ExceRev {
    public static void main(String[] args) {
        try 
        {
            int a = 10, b = 0, c;
            c = a / b;
            System.out.println("The division is: " + c);
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("You cannot divide by zero.");
        } 
        finally 
        {
            System.out.println("Always remember to handle exceptions for smooth execution of the application.");
        }
    }
}


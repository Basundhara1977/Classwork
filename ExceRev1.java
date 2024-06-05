package com.test;

public class ExceRev1 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[3] = 7;
            a[4] = 56;
            System.out.println(a[3]);
            System.out.println(a[4]);
            a[8] = 67; // This will cause ArrayIndexOutOfBoundsException
            System.out.println(a[8]); // This line won't be reached due to the exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("The specified array index is out of bounds.");
        } finally {
            System.out.println("Always remember to handle exceptions for smooth execution of the application.");
        }
    }
}



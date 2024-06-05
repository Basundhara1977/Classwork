package com.test;

public class ExceRev2 {

    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            int c = 23 / 0;
            a[5] = 50 / 5;
            System.out.println(a[5]);
        } 
        catch (ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("You cannot divide by zero.");
        } 
        catch (ArrayIndexOutOfBoundsException o)
        {
            System.out.println(o);
            System.out.println("The specified array index is out of bounds.");
        }
        System.out.println("No exception occurred beyond this point.");
    }
}


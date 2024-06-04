package com.test;

public class Test1 implements MyMethods {
      
    public int length = 5;
    public int breadth = 6;
    public int area;

    @Override
    public void display() {
        System.out.println("This is a rectangle.");
    }

    @Override
    public void accept() {
        area = length * breadth;
        System.out.println("The area of rectangle is: " + area);
    }

    public static void main(String[] args) {
        Test1 obj = new Test1(); 
        obj.display();
        obj.accept();
    }
}


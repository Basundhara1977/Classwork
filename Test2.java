package com.test;

public class Test2 implements MyMethods {
      
	double r=2,area;
	
	@Override
	public void display() {
		//TODO Auto-generated method stub 
		System.out.println("this is circle");
		
	}
	
	@Override
	public void accept() {
		//TODO Auto-generated method stub 
		area=3.14*r*r;
		System.out.println("The area of circle is:"+area);
		
	}
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub 
		Test2 obj=new Test2();
		obj.display();
		obj.accept();
		
	}
}

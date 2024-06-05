package com.test;

import java.util.Scanner;

public class CustomEx1 {
	public void check(int a)
	{
		if(a<18)
		{
			throw new ArithmeticException("you are not eligible for voting!!!");
		}
		else
		{
			System.out.println("its your Right to vote!!!");
		}
	}
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		CustomEx1 obj=new CustomEx1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		obj.check(age);
	}

}

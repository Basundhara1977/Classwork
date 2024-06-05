package com.test;

import java.util.Scanner;

public class CustomEx2 {
	int age;
	String name;
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your age:");
		age=sc.nextInt();
		
	}
	public void Validation() 
	{
		if(age>=3)
		{
			System.out.println("You have to grown up to get Education");
		}
		else
		{
			throw new ArithmeticException("you are lucky!!!Enjoy your childhood");
		}
	}
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		CustomEx2 obj=new CustomEx2();
		obj.accept();
		obj.Validation();
	}

}
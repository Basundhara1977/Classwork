package com.example;

import java.util.TreeMap;
import java.util.Map;

public class FruitsCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> fruits = new TreeMap<String, Integer>();
		
		//Adding elements to the tree map
		fruits.put("Apple", 70);
		fruits.put("Banana", 133);
		fruits.put("Cherry", 80);
		fruits.put("Mango", 200);
		System.out.println(fruits);
		
		TreeMap<String, Integer> morefruits = new TreeMap<String, Integer>();
		
		morefruits.put("Stawberry", 330);
		morefruits.put("jackfruit", 45);
		morefruits.put("Dragonfruit", 145);
		
		fruits.putAll(morefruits);
		
		System.out.println(fruits);
		
		//GET THE ELEMENTS
		
		System.out.println("The value of searched key is:" +fruits.get("Mango"));
		
		fruits.remove("jackfruit");
		System.out.println("List after removing cherry");
		System.out.println(fruits);
		
		fruits.clear();
		System.out.println(fruits);
		
		System.out.println(fruits.isEmpty());
		
		fruits.put("chickoo", 50);
		System.out.println(fruits.isEmpty());
		

	}

}


package com.test;

import java.util.Set;
import java.util.HashSet;

class SetDemo {
	public static void main(String[] args) {
		//creating a set using the HashSet class
		Set<Integer> set1 = new HashSet<>();
		
		//add elements to the set1
		
		set1.add(2);
		set1.add(3);
		System.out.println("Set1: " + set1);
		
		//creating another set using hashset class
		Set<Integer> set2 = new HashSet<>();
		
		//Add elements
		set2.add(1);
		set2.add(2);
		System.out.println("Set2: " + set2);
		
		//union of two states
		set2.addAll(set1);
		System.out.println("Union is: " + set2);
	}
}


package com.example;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a map using the HashMap
		Map<String, Integer> emp = new HashMap<String, Integer>();
		
		//Insert elements to the map
		emp.put("Raj02",10678);
		emp.put("Priya03",83672);
		emp.put("Siyaa23",90878);
		emp.put("Rohan12",87654);
		System.out.println("Map: " + emp);
		
		//Access keys of the map
		System.out.println("Keys: " + emp.keySet());
		
		//Access values of the map
		System.out.println("Values: " + emp.values());
		
		//Access entries of the map
		System.out.println("Entries: " + emp.entrySet());
		
		//Remove elements from the map
		int value = emp.remove("Raj02");
		System.out.println("Removed Values: " + value);
	}

}

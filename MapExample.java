package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("actor","Sunil");
		map.put("ceo","Sagar");
		map.put("accountant","Ram");
		map.put("clerk","Piyali");
		map.put("clerk","Sam");
		
		System.out.println(map.get("doctor"));
		
		Set<String> designation=map.keySet();
		for(String key:designation)
		{
			System.out.println(map.get(key));
		}
		
		for(String key:designation)
		{
			System.out.println(key+" "+map.get(key));
		}
		
		

	}

}

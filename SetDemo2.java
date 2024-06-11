package com.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> studlist = new HashSet<String>();

		studlist.add("Divya");
        studlist.add("Priya");
        studlist.add("Purva");
        studlist.add("Ram");
        studlist.add("Shyam");

        System.out.println("The student list added is as follows:" + studlist);
        
        Iterator<String> iterator = studlist.iterator();
        
        while (iterator.hasNext()) {
        	String name = iterator.next();
        	System.out.println(name);
        }
        
        studlist.remove("sanika");
        System.out.println("List of elements after remove of elements:" +studlist);

    }

}



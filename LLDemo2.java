package com.test;

import java.util.LinkedList;
import java.util.Iterator;

public class LLDemo2 {

    public static void main(String[] args) {
        // Create a linked list to store vegetables
        LinkedList<String> vegetables = new LinkedList<String>();
        System.out.println("Initial size of Vegetable List: " + vegetables.size());

        // Add vegetables to the list
        vegetables.add("Spinach");
        vegetables.add("Broccoli");
        vegetables.add("Carrot");
        vegetables.add("Bell Pepper");
        System.out.println("Vegetables in the list: " + vegetables);
        System.out.println("Size of Vegetable List after addition: " + vegetables.size());

        // Remove a vegetable
        vegetables.remove("Carrot");
        System.out.println("Vegetables in the list after removing Carrot: " + vegetables);
        System.out.println("Size of Vegetable List after removal: " + vegetables.size());

        // Remove first and last vegetables
        String firstVegetable = vegetables.removeFirst();
        String lastVegetable = vegetables.removeLast();
        System.out.println("First vegetable removed: " + firstVegetable);
        System.out.println("Last vegetable removed: " + lastVegetable);
        System.out.println("Vegetables in the list after removing first and last: " + vegetables);
        System.out.println("Size of Vegetable List after deletion: " + vegetables.size());

        // Display first and last vegetables
        if (!vegetables.isEmpty()) {
            System.out.println("First vegetable in the list: " + vegetables.getFirst());
            System.out.println("Last vegetable in the list: " + vegetables.getLast());
        } else {
            System.out.println("The vegetable list is empty.");
        }

        // Display all vegetables using an iterator
        System.out.println("Vegetables in the list:");
        Iterator<String> iterator = vegetables.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

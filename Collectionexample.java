package com.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class Collectionexample {

    public static void main(String[] args) {
        // Using HashSet to store my favorite fruits
        Set<String> favoriteFruits = new HashSet<String>();
        favoriteFruits.add("Apple");
        favoriteFruits.add("Banana");
        favoriteFruits.add("Orange");
        favoriteFruits.add("Mango");
        favoriteFruits.add("Dragonfruit");
        

        // Using LinkedHashSet to store my favorite vegetables
        Set<String> favoriteVegetables = new LinkedHashSet<String>();
        favoriteVegetables.add("Carrot");
        favoriteVegetables.add("Spinach");
        favoriteVegetables.add("Broccoli");
        favoriteVegetables.add("Tomato");
        favoriteVegetables.add("Cabbage");

        // Printing the lists
        System.out.println("List of Favorite Fruits: " + favoriteFruits);
        System.out.println("List of Favorite Vegetables: " + favoriteVegetables);

        // Checking if a fruit or vegetable is in the set
        System.out.println("Does the favorite fruits set contain 'Banana'? " + favoriteFruits.contains("Banana"));
        System.out.println("Does the favorite vegetables set contain 'Potato'? " + favoriteVegetables.contains("Potato"));

        // Removing a fruit or vegetable from the set
        favoriteFruits.remove("Orange");
        favoriteVegetables.remove("Broccoli");

        // Printing the modified lists
        System.out.println("List of Favorite Fruits after removal: " + favoriteFruits);
        System.out.println("List of Favorite Vegetables after removal: " + favoriteVegetables);

        // Iterating through the sets
        System.out.println("Iterating through favorite fruits:");
        Iterator<String> fruitIterator = favoriteFruits.iterator();
        while (fruitIterator.hasNext()) 
        {
            System.out.println(fruitIterator.next());
        }

        System.out.println("Iterating through favorite vegetables:");
        Iterator<String> vegetableIterator = favoriteVegetables.iterator();
        while (vegetableIterator.hasNext()) 
        {
            System.out.println(vegetableIterator.next());
        }
    }
}


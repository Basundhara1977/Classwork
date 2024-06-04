package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class CountryArrayList {

    public static void main(String[] args) {
        int count;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> country = new ArrayList<String>();
        System.out.println("How many countries do you want to add:");
        count = sc.nextInt();
        // consume the newline character left in the buffer
        sc.nextLine(); 
        System.out.println("Enter Countries:");
        for (int i = 1; i <= count; i++) {
            System.out.println("country" + i + ": ");
            String Country = sc.nextLine();
            country.add(Country);
        }
        System.out.println(country);
        sc.close(); // close the scanner when done
    }
}


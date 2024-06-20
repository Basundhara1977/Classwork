package Application.example;

import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 0.0;

        while (true) {
            // Display the menu
            System.out.println("\nWelcome to Simple Bank!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            // Get user input
            int choice = input.nextInt();

            // Process the choice
            if (choice == 1) {
                // Check balance
                System.out.println("Your current balance is: $" + balance);
            } else if (choice == 2) {
                // Deposit Money
                System.out.println("Enter amount to be deposited:");
                double amount = input.nextDouble();
                if (amount > 0) {
                    balance += amount;
                    System.out.println("$" + amount + " deposited successfully.");
                } else {
                    System.out.println("Invalid amount");
                }
            } else if (choice == 3) {
                // Withdraw money
                System.out.println("Enter amount to withdraw: ");
                double amount = input.nextDouble();
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    System.out.println("$" + amount + " withdrawn successfully.");
                } else {
                    System.out.println("Invalid amount or insufficient funds.");
                }
            } else if (choice == 4) {
                // Exit
                System.out.println("Thank you for using Simple Bank. Goodbye!");
                break;
            } else {
                // Invalid choice
                System.out.println("Invalid choice. Please try again");
            }
        }
        input.close(); // Closing the Scanner object
    }
}

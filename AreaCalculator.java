package Application.example;

import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            // Display the menu
            System.out.println("\nArea Calculator:");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Square");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            // Get user input
            int choice = input.nextInt();

            // Process the choice
            switch (choice) {
                case 1:
                    System.out.println("Enter base length of the triangle:");
                    double base = input.nextDouble();
                    System.out.println("Enter height of the triangle:");
                    double height = input.nextDouble();
                    double triangleArea = 0.5 * base * height;
                    System.out.println("The area of the triangle is: " + triangleArea);
                    break;
                case 2:
                    System.out.println("Enter length of the rectangle:");
                    double length = input.nextDouble();
                    System.out.println("Enter width of the rectangle:");
                    double width = input.nextDouble();
                    double rectangleArea = length * width;
                    System.out.println("The area of the rectangle is: " + rectangleArea);
                    break;
                case 3:
                    System.out.println("Enter radius of the circle:");
                    double radius = input.nextDouble();
                    double circleArea = Math.PI * radius * radius;
                    System.out.println("The area of the circle is: " + circleArea);
                    break;
                case 4:
                    System.out.println("Enter side length of the square:");
                    double side = input.nextDouble();
                    double squareArea = side * side;
                    System.out.println("The area of the square is: " + squareArea);
                    break;
                case 5:
                    System.out.println("Exiting Area Calculator...");
                    input.close(); // Closing the Scanner object
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}


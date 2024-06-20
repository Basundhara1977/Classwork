package Application.example;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int a, b, ans, choice;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Online calculator:");
        System.out.println("Press \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
        System.out.println("Enter your choice:");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter two numbers:");
                a = sc.nextInt();
                b = sc.nextInt();
                ans = a + b;
                System.out.println("The addition of two numbers is:" + ans);
                break;

            case 2:
                System.out.println("Enter two numbers:");
                a = sc.nextInt();
                b = sc.nextInt();
                ans = a - b;
                System.out.println("The subtraction of two numbers is:" + ans);
                break;

            case 3:
                System.out.println("Enter two numbers:");
                a = sc.nextInt();
                b = sc.nextInt();
                ans = a * b;
                System.out.println("The multiplication of two numbers is:" + ans);
                break;
                
            case 4:
            	System.out.println("Enter two numbers:");
            	a=sc.nextInt();
            	b=sc.nextInt();
            	ans = a/b;
            	System.out.println("The division of two numbers is:" + ans);
            	break;

            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close(); // Closing the Scanner object to avoid resource leak
    }
}


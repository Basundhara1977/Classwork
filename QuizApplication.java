package Application.example;

import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        String[] questions = {
            "1. What is the capital of France?\n(a) Paris\n(b) London\n(c) Rome",
            "2. Who wrote 'Harry Potter' series?\n(a) J.K. Rowling\n(b) J.R.R. Tolkien\n(c) Stephen King",
            "3. What is the largest planet in our solar system?\n(a) Earth\n(b) Jupiter\n(c) Saturn"
        };
        char[] answers = {'a', 'a', 'b'};

        System.out.println("Welcome to the Quiz App!");
        
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            char userAnswer = input.next().charAt(0);
            
            if (Character.toLowerCase(userAnswer) == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }

        System.out.println("\nQuiz completed!");
        System.out.println("Your final score is: " + score + " out of " + questions.length);

        input.close(); // Closing the Scanner object
    }
}



package org.example.chapter5_loops;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {

        //random numbers generation
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        //user input
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhat is " + num1 + " + " + num2 + "? ");
        int answer = input.nextInt();

        //while user is not guessing correctly,
        //ask again, till guesses correctly
        while(answer != (num1 + num2)) {
            System.out.print("Please try again.");
            System.out.print("\nWhat is " + num1 + " + " + num2 + "? ");
            answer = input.nextInt();
            System.out.println(num1 + " + " + num2 + " = " + answer +
                    " is " + (num1 + num2 == answer) + ".");
        }

        System.out.println("Your answer is correct. Well done!");
    }
}

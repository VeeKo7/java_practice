package org.example.chapter5_loops;

import java.util.Scanner;

public class GuessingNumbers {
    public static void main(String[] args) {
        //generate random number between 0 and 100 inclusive
        int randomNum = (int)(Math.random() * 101);

        //user input
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 100. ");
        int guess = -1;
        while (guess != randomNum) {
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();

            if (randomNum == guess) {
                System.out.println("Yes, the number is " + randomNum);
            } else if (randomNum < guess) {
                System.out.print("You are aiming too high.");
            } else {
                System.out.print("You are aiming too low.");
            }
        }
    }
}

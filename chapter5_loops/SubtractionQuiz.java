package org.example.chapter5_loops;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int correctAmount = 0;//count the number of correct questions
        int count = 0;//count the number of questions
        long startTime = System.currentTimeMillis();
        String output = " ";//output string is initially empty
        Scanner input = new Scanner(System.in);

        while(count < NUMBER_OF_QUESTIONS) {
            //generate 2 random single-digit integers
            int num1 = (int)(Math.random() * 10);
            int num2 = (int)(Math.random() * 10);

            //if num1 < num2, swap num1 and num2
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            //prompt the student to answer "What is num1 - num2?"
            System.out.print("What is " + num1 + " - " + num2 + "? ");
            int answer = input.nextInt();

            //grade the answer and display the result
            if (num1 - num2 == answer) {
                System.out.println("You are correct!");
                correctAmount++;
            } else {
                System.out.println("Answer is wrong.\n" + num1 + " - " + num2 + " should be " + (num1 - num2));
            }

            //increase the question count
            count++;

            output += "\n" + num1 + " - " + num2 + " = " + answer + ((num1 - num2 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctAmount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}

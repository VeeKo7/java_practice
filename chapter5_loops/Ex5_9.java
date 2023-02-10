package org.example.chapter5_loops;

import java.util.Scanner;

/**
 * *5.9 (Find the two highest scores) Write a
 * program that prompts the user to enter the
 * number of students and each student’s name
 * and score, and finally displays the student
 * with the highest score and the student with
 * the second-highest score. Use the next() method
 * in the Scanner class to read a name rather than
 * using the nextLine() method. Assume that the number of students is at least 2.
 *
 *
 * How to find the second highest score?
 * */

public class Ex5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int student = input.nextInt();
        int count = 0;
        String name = "";
        double score = 0;
        double first = 0;
        double second = 0;
        String winner = "";
        String secondBest = "";

        while (count < student) {
            System.out.print("Enter student's name: ");
            name = input.next();
            System.out.print("Enter student's score: ");
            score = input.nextDouble();
            if (first < score) {
                //score = 2, first = 1, second = 0
                //score > first, first > second
                second = first;
                secondBest = winner;
                first = score;
                winner = name;
            }
            count++;
        }

        System.out.println("Winner is " + winner + " with a highest score of " + first +".");
        System.out.println("Second winner is " + secondBest + " with a highest score of " + second +".");
    }
}

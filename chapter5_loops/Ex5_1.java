package org.example.chapter5_loops;

import java.util.Scanner;

/**
 * (Count positive and negative numbers and compute the average
 * of numbers) Write a program that reads an unspecified number
 * of integers, determines how many positive and negative values
 * have been read, and computes the total and average of the input
 * values (not counting zeros). Your program ends with the input 0.
 * Display the average as a floating-point number.
 *
 * Issue not correct count positives and negatives.
 * */

public class Ex5_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int countTotal = 0;
        double total = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");

        while (true) {
            int number = input.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number == 0) {
                break;
            } else {
                negativeCount++;
            }

            total = total + number;
            countTotal++;
        }

        double average = total / countTotal;

        System.out.println("The number of positives is " + positiveCount);
        System.out.println("The number of negatives is " + negativeCount);
        System.out.println("The number of total is " + countTotal);
        System.out.println("The average is " + average);
    }
}

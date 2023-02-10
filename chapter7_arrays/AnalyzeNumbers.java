package org.example.chapter7_arrays;

import java.util.Scanner;

/**
 * 1. read 100 numbers
 * 2. get their average
 * 3. find the number of items
 * above the average of all the items.
 * */

public class AnalyzeNumbers {

    public static void main(String[] args) {

        //scanner creation & user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        //create a double numbers [] with length n
        double [] numbers = new double[n];
        //create & initialize sum
        int sum = 0;

        //enter value into array with user input
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();

            //summing numbers in array
            sum += numbers[i];
        }

        //calculate average
        double average = sum / n;

        //count the number of elements above average
        int count = 0;
        for (int i = 0; i < 4; i++) {
            //count number above average
            if (numbers[i] > average) {
                count++;
            }
        }

        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);
    }
}

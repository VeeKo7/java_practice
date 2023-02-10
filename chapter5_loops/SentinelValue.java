package org.example.chapter5_loops;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //read the initial data
        System.out.print("Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();
        int sum = 0;
        //keep reading data until the input is 0
        while(data != 0) {
            sum = sum + data;
            //read the next data
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }
        System.out.println("Program terminated.");
        System.out.println("The sum is " + sum);
    }
}

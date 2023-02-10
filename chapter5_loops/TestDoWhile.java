package org.example.chapter5_loops;

import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {
        int data;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        //keep reading data until the input is 0
        do {
            //read the next data
            System.out.print("Enter an integer (the input ends if it is 0: ) ");
            data = input.nextInt();
            sum = sum + data;
        } while (data != 0);
        System.out.println("The sum is " + sum);
    }
}

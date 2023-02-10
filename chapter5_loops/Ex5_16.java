package org.example.chapter5_loops;

import java.util.Scanner;

/**
 * *5.16 (Find the factors of an integer)
 * Write a program that reads an integer
 * and displays all its smallest factors
 * in an increasing order. For example,
 * if the input integer is 120, the output
 * should be as follows: 2, 2, 2, 3, 5.
 * */

public class Ex5_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

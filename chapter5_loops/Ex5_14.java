package org.example.chapter5_loops;

import java.util.Scanner;

/**
 **5.14 (Compute the greatest common divisor)
 * Another solution for Listing 5.9 to find
 * the greatest common divisor of two integers
 * n1 and n2 is as follows: First find d to be
 * the minimum of n1 and n2, then check whether
 * d, d–1, d–2, …, 2, or 1 is a divisor for
 * both n1 and n2 in this order. The first such
 * common divisor is the greatest common divisor for n1 and n2.
 * Write a program that prompts the user to enter two positive
 * integers and displays the gcd.
 *
 *
 **/

public class Ex5_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        /*
        First find d
        to be the minimum of n1 and n2, then check whether
        d, d–1, d–2, …, 2, or 1 is
a divisor for both n1 and n2 in this order
        */
        int d = Math.min(num1, num2);

        while (true) {
            if (num1 % d == 0 && num2 % d == 0) {
                break;
            }
            d--;
        }

        System.out.println("Smallest of 2 numbers is " + d);

    }
}

package org.example.chapter6_methods;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter first number: ");
        int number2 = input.nextInt();

        System.out.println("The greatest common divisor for " + number1 +
                " and " + number2 + " is " + gcd(number1, number2));
    }

    //return the gcd of two integers
    public static int gcd(int n1, int n2) {
        //initial gcd is 1
        int gcd = 1;
        //possible gcd
        int k = 2;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            //increase k for next possible gcd
            k++;
        }
        return gcd;
    }
}

package org.example.chapter5_loops;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        ///user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();

        //greatest common divisor
        int gcd = 1;
        //possible gcd
        int k = 2;
        //After the loop, gcd is the greatest
        //common divisor for n1 and n2
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                //update gcd
                gcd = k;
            }
            //next possible gcd
            k++;//3 4 5 6 etc
        }

        //instead of while loop, we could use a for loop
//        for (int k = 2; k <= n1 / 2 && k <= n2 / 2; k++) {
////              if (n1 % k == 0 && n2 % k == 0) {
////                     gcd = k;
////             }
//        }


        System.out.println("The greatest common divisor for " + n1 + " & " + n2 + " is " + gcd + ".");
    }
}

package org.example.chapter5_loops;

import java.util.Scanner;

public class TestWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, max;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        max = number;
        System.out.println("max: " + max);

        while (number != 0) {
            System.out.print("Enter another number: ");
            number = input.nextInt();
            if(number > max) {
                max = number;
            }
        }

        System.out.println("max is " + max);
        System.out.println("number is " + number);
    }
}

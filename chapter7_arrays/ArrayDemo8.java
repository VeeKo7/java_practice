package org.example.chapter7_arrays;

import java.util.Scanner;

/**
 * Simplifying coding
 * Obtain english name of a given month by its number
 * */

public class ArrayDemo8 {

    public static void main(String[] args) {

        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month number (1 - 12): ");
        int monthNumber = input.nextInt();
        System.out.println("monthNumber: " + months[monthNumber]);

    }
}

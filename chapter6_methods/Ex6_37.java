package org.example.chapter6_methods;

// need better solution

/**
 * Program formats an integer
 * according to the width entered
 * by the user e.g. format (34, 4)
 * >> 0034, format (34, 5)
 *  * >> 00034
 * */

import java.util.Scanner;

public class Ex6_37 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter the width of a number: ");
        int width = input.nextInt();
        System.out.println(format(number, width));

    }

    /**
     * Formats integer according to
     * a specified width
     * @param number to format,
     * width determines number of zeros
     * in front of a number
     * @return formatted integer with a specified width
     */
    public static String format (int number, int width) {

        //converted int into String
        String str = String.valueOf(number);
        //getting number's length
        int numLength = str.length();
        //calculating number of zeros we want
        int size = width - numLength;//4 - 2 = 2

        if (size <= 0) {
            return str;
        } else
            return "0".repeat(size) + str;//2 0s

    }
}

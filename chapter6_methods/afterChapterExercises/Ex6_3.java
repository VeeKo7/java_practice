package org.example.chapter6_methods.afterChapterExercises;

import java.util.Scanner;

public class Ex6_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            System.out.println(isPalindrome(number));
        }
    }

    /**
     * return reversal of an int, 456 returns 654
     */
    public static int reverse (int number) {
        //convert to
        String numStr = String.valueOf(number);
        StringBuilder reverseStr = new StringBuilder();

        for (int i = numStr.length() - 1; i >= 0; i--) {//abc
            reverseStr.append(numStr.charAt(i));
        }
        //convert StringBuilder to String
        return Integer.parseInt(reverseStr.toString());
    }

    /**
     * return true if number is palindrome
     * */

    public static boolean isPalindrome (int number) {

        //if number is equal to reverse of the number - palindrome
        return (number == reverse(number));
    }
}
/*
* String abc = cba
* abc = a, b, c
* reverse for loop
* */
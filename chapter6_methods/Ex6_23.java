package org.example.chapter6_methods;

//needs fixing - does not return the number of specified letter

import java.util.Scanner;

/**
 * Program finds occurrences of the same characters
 * and counts them.
 * */

public class Ex6_23 {

    public static void main(String[] args) {

        //user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        System.out.print("Enter a letter for count: ");
        char letter = input.next().charAt(0);
        //System.out.println("Letter: " + Character.getType(letter)); meaning? Letter: 2
        System.out.println(count(str, letter));

    }

    /**
     * Find the number of occurrences of
     * a specified character in a string
     * @param str - string, a - specified
     * character in that string
     * @return number of occurrences
     * of specified letter - count
     */

    public static int count (String str, char a) {
        int count = 0;
        //looping through the str String
        for (int i = 0; i < str.length(); i++) {
            //converting String str into char ch
            char ch = str.charAt(i);
            //if s contains a than increase count
            if (ch == a) {
                count++;
            }
        }
        return count;
    }
}

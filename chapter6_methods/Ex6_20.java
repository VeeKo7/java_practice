package org.example.chapter6_methods;


import java.util.Scanner;

/**
 * Program counts the letters in a string
 */

public class Ex6_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any word or sentence: ");
        String s = input.nextLine();
        System.out.println("This word " + s + " has " + countLetters(s) + " letters.");
    }

    /**
     * Method counts letters in a string
     *
     * @param s - where letters need to be counted
     * @return counted letters in a string
     */
    public static int countLetters(String s) {
        int countLetters = 0;
//        while (countLetters < s.length()) {
//            countLetters++;
//        }

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {

                countLetters++;
            }

        }
        return countLetters;
    }
}

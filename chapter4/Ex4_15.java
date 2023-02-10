package org.example.chapter4;

/**
 * Program returns numbers according
 * to letters on a phone keypad.
 * */

import java.util.Scanner;

public class Ex4_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.next();

        if (!(isValidLetter(letter))) {
            System.out.println(letter + " is an invalid input");
        } else {
            displayNumber(letter.toLowerCase());
        }
    }

    /**
     * To make sure entered input is a letter
     * @param letter - letter
     * @return true or false
     * */
    public static boolean isValidLetter (String letter) {

        for (int i = 0; i < letter.length(); i++) {
            char ch = letter.charAt(i);

            if (!(Character.isLetter(ch))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Displays corresponding number for a letter
     *
     * @param letter that returns a corresponding number
     */
    public static void displayNumber (String letter) {


        switch (letter) {
            case "a":
            case "b":
            case "c":
                System.out.println(2);
                break;
            case "d":
            case "e":
            case "f":
                System.out.println(3);
                break;
            case "g":
            case "h":
            case "i":
                System.out.println(4);
                break;
            case "j":
            case "k":
            case "l":
                System.out.println(5);
                break;
            case "m":
            case "n":
            case "o":
                System.out.println(6);
                break;
            case "p":
            case "q":
            case "r":
            case "s":
                System.out.println(7);
                break;
            case "t":
            case "u":
            case "v":
                System.out.println(8);
                break;
            case "w":
            case "x":
            case "y":
            case "z":
                System.out.println(9);
                break;
        }
    }
}

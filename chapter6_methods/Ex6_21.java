package org.example.chapter6_methods;

/**
 * Program takes a user input for a number
 * as a string like 1800Flowers or 1-800-Flowers
 * and returns 18003569377 or 1-800-3569377.
 * */

import java.util.Scanner;

public class Ex6_21 {

    public static void main(String[] args) {

        //user input
        Scanner input = new Scanner(System.in);
        //1-800-Flowers
        //1800Flowers
        System.out.print("Enter a string: ");
        String s = input.next();
        String sToUpperCase = s.toUpperCase();
        char letter = 0;
        //length of entered string
        for (int i = 0; i < sToUpperCase.length(); i++) {
            //separate each letter/number and assign it to a character
            letter = sToUpperCase.charAt(i);//'K'
            String str = "" + letter;//"K"
            //String str2 = Character.toString(letter);
            //String str3 = String.valueOf(letter);
            //if character contains a number/digit
            //leave it as it is
            if (Character.isDigit(letter)) {
                System.out.print(letter);
            }
            //if character is a symbol - ,
            //leave it as it is
            else if (str.contains("-")) {
                System.out.print("-");
            } else {
                //before we are transferred to getNumber() method,
                //letter will be converted into uppercase
                System.out.print(getNumber(letter));
            }
        }
    }

    /**
     * @param upperCaseLetter coming from string user input
     * @return a number given an uppercase letter
     */
    public static int getNumber (char upperCaseLetter) {

        int number = 0;

        switch (upperCaseLetter) {
            case 'A':
            case 'B':
            case 'C':
                number = 2;
                break;
            case 'D':
            case 'E':
            case 'F':
                number = 3;
                break;
            case 'G':
            case 'H':
            case 'I':
                number = 4;
                break;
            case 'J':
            case 'K':
            case 'L':
                number = 5;
                break;
            case 'M':
            case 'N':
            case 'O':
                number = 6;
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                number = 7;
                break;
            case 'T':
            case 'U':
            case 'V':
                number = 8;
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                number = 9;
                break;
        }

        return number;
    }
}

package org.example.chapter4;

/**
 * Write the code that generates a random lowercase letter.
 * */

public class Ex4_3_7 {
    public static void main(String[] args) {
        //generate random number between 97 - 122 including
        int min = 97;
        int max = 122;
        int rangeForDecimal = (max - min) + 1;
        int randomNumber = (int)(Math.random() * rangeForDecimal) + min;
        System.out.println(randomNumber);
        char lowerRandomLetter = (char) randomNumber;
        System.out.println(lowerRandomLetter);
    }
}
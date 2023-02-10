package org.example.chapter4;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = input.next();

        //display length
        System.out.println(s.length());

        //display first char
        System.out.println(s.charAt(0));

    }
}

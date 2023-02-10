package org.example.chapter4;

import java.util.Scanner;

public class ISBNString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //enter ISBN number as a String
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        String s4 = input.next();
        String s5 = input.next();
        String s6 = input.next();
        String s7 = input.next();
        String s8 = input.next();
        String s9 = input.next();

        //convert all Strings to int again
        int d1 = Integer.parseInt(s1);
        int d2 = Integer.parseInt(s2);
        int d3 = Integer.parseInt(s3);
        int d4 = Integer.parseInt(s4);
        int d5 = Integer.parseInt(s5);
        int d6 = Integer.parseInt(s6);
        int d7 = Integer.parseInt(s7);
        int d8 = Integer.parseInt(s8);
        int d9 = Integer.parseInt(s9);

        //d10 = checksum
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.println("checksum: " + d10);

        if(d10 == 10) {
            System.out.printf("The ISBN-10 number is %d%d%d%d%d%d%d%d%d%c", d1,d2,d3,d4,d5,d6,d7,d8,d9,'X');
        } else {
            System.out.printf("The ISBN-10 number is %d%d%d%d%d%d%d%d%d%d", d1,d2,d3,d4,d5,d6,d7,d8,d9,d10);
        }
    }
}

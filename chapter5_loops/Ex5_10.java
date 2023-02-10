package org.example.chapter5_loops;

/**
 * Write a program that displays all the
 * numbers from 100 to 1,000 (10 per line)
 * that are divisible by 5 and 6.
 * Numbers are separated by exactly one space.
 * */

//Struggle to display 10 numbers per line.

public class Ex5_10 {
    public static void main(String[] args) {

        int count = 0;

        //looping from 100 to 1000
        for (int i = 100; i <= 1000 ; i++) {
            //numbers divisible by 5 & 6 will be displayed
            if (i % 5 == 0 && i % 6 == 0) {
                if (count % 10 == 0) {
                    System.out.println();
                    //count = 0;
                }
            System.out.print(" " + i);
            count++;
            }
        }
    }
}

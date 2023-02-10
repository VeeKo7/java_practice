package org.example.chapter5_loops;

/**
 * Need to display numbers divisible by 5 & 6
 * & print out 10 numbers in line then
 * jump on to the next line
 *
 * Issue with printing 10 numbers per line.
 * */

public class Ex5_11 {
    public static void main(String[] args) {

        int count = 0;

        //looping from 100 to 1000
        for (int i = 100; i <= 200; i++) {
            //display only i divisible by 5 & 6
            if ((i % 5 == 0) && (i % 6 == 0)) {
                if (count == 10) {
                    System.out.println();
                    count = 0;
                }
                System.out.print(" " + i);
                count++;
            }
        }
    }
}

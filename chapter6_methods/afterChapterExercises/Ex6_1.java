package org.example.chapter6_methods.afterChapterExercises;

/**
 * Return a pentagonal number
 * */

public class Ex6_1 {
    public static void main(String[] args) {

        //System.out.println("getPentagonalNumber1: " + getPentagonalNumber1(100));
        getPentagonalNumber2(100);
    }

//    public static int getPentagonalNumber1(int n) {
//
//        int pentagonalNumber = n * (3 * n -1) / 2;
//        return pentagonalNumber;
//    }

    public static void getPentagonalNumber2 (int n) {

        int pentagonalNumber = 0;
        final int NUMBERS_PER_LINE = 10;

        //we need to test 100 numbers for pentagonal numbers
        //so n is now 100, let's loop from 0 to 100
        for (int i = 0; i <= n; i++) {
            pentagonalNumber = i * (3 * i -1) / 2;

                if (i % NUMBERS_PER_LINE == 0) {
                    System.out.printf("\n%7d", pentagonalNumber);
                } else {
                    System.out.printf("%7d", pentagonalNumber);
                }
            }
        }
}

package org.example.chapter6_methods;

import java.util.Random;
import java.util.Scanner;

public class Ex6_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        printMatrix(n);

    }

    /**
     * print matrix n-by-n
     * @param n n
     */
    public static void printMatrix(int n) {

        Random rn = new Random();

        for (int i = 0; i < n; i++) {//111 ln
            for (int j = 0; j < n; j++) {//111
                System.out.print(rn.nextInt(2) + " ");
            }
            System.out.println();
        }
    }
}

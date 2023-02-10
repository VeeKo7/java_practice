package org.example.chapter5_loops;

import java.util.Scanner;

class Ex5_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number from 1 to 15: ");
        int number = input.nextInt();
        int spacesCount = number;

        for (int i = 1; i <= number; ++i) {
            System.out.print("**".repeat(spacesCount));
            for (int k = i; k > 1; k--) {
                System.out.print(k + " ");
            }

            for (int j = 1; j <= i; ++j) {
                if (j == i) {
                    System.out.print(j);
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.print("**".repeat(spacesCount));
            System.out.println();
            spacesCount--;
        }
    }
}


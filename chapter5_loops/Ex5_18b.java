package org.example.chapter5_loops;

import java.util.Scanner;

public class Ex5_18b {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number from 1 to 9: ");
        int number = input.nextInt();

        for (int i = number; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

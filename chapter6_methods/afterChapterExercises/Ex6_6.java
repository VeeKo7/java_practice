package org.example.chapter6_methods.afterChapterExercises;

import java.util.Scanner;

public class Ex6_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        displayPattern(n);
    }

    public static void displayPattern (int n) {

        int spaceCount = n;

        for (int i = 1; i <= n; ++i) {
            System.out.print("  ".repeat(spaceCount));
            for (int j = i; j >= 1; j--) {
                System.out.print(" " + j);
            }
            System.out.println();
            spaceCount--;
        }
    }
}

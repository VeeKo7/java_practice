package org.example.chapter5_loops;

import java.util.Scanner;
//weird
public class TestEndOfInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while (input.hasNext()) {
            System.out.print("Enter a number: ");
            sum = sum + input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}

package org.example.chapter5_loops;

import java.util.Scanner;

/**
 * Find the highest score.
 * */

public class Ex5_8 {
    public static void main(String[] args) {

        int count = 0;
        double max = 0;
        String winner = "";
        //user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        do {
            System.out.print("Enter student's name: ");
            String name = input.next();
            System.out.print("Enter student's score: ");
            double score = input.nextDouble();
            count++;

            if(score > max) {
                max = score;
                winner = name;
            }
        } while (count < numberOfStudents);
        System.out.println("The name of the winner " +
                "who gained greatest score " + max + " is " + winner
        + ".");
    }
}

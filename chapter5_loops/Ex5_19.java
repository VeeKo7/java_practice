package org.example.chapter5_loops;

public class Ex5_19 {
    public static void main(String[] args) {

        int startingNumber = 1;
        int spaceCount = 7;

        //outer for loop is responsible for printing lines
        for (int i = 1; i <= 8; i++) {

            System.out.print("     ".repeat(spaceCount));
            //reverse loop
            for (int j = 1; j < startingNumber ; j = j * 2) {
                System.out.printf("%5d", j);
            }

            //responsible for printing numbers on the right side
            for (int j = startingNumber; j >= 1; j = j / 2) {
                System.out.printf("%5d", j);
            }
            startingNumber = startingNumber * 2;
            System.out.println();

            spaceCount--;
        }
    }
}

//1. numbers are doubling itself 1 2 4 8 16 32 64 128
//2.
//3. increment is times 2, and decrement divide by 2

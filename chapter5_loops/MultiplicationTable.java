package org.example.chapter5_loops;

/*
* demo of nested loops
* */

public class MultiplicationTable {
    public static void main(String[] args) {
        //display the table heading
        System.out.println("          Multiplication Table");
        //display the number title
        System.out.print("   ");
        for (int j = 1; j <= 9; j++) {//1 2 3 4 5 6 7 8 9
            System.out.print("   " + j);
        }
        System.out.println("\n----------------------------------------");
        //display the body
        for (int i = 1; i <= 9; i++) {
            //1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
            System.out.print(i + " |");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}

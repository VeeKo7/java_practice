package org.example.chapter7_arrays;

import java.util.Scanner;

/**
 * Initializing arrays with input values
 * */

public class ArrayDemo {

    public static void main(String[] args) {

        double [] myList = new double[10];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
            System.out.print(myList[i] + " ");
        }
    }

}

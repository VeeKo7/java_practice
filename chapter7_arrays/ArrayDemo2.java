package org.example.chapter7_arrays;

/**
 * Initializing arrays with random values
 * */

public class ArrayDemo2 {

    public static void main(String[] args) {

        double [] myList = new double[10];

        for (int i = 0; i < myList.length; i++) {
            //0.0 - 100.0 but less than 100.0
            myList[i] = Math.random() * 100;
            System.out.printf("%.2f\n", myList[i]);
        }
    }
}

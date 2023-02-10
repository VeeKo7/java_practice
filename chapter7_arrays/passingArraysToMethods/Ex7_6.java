package org.example.chapter7_arrays.passingArraysToMethods;

public class Ex7_6 {

    public static void main(String[] args) {

        //invoke a method with array argument
        printArray(new int [] {3, 1, 6, 2, 4});
    }

    public static void printArray(int [] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

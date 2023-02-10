package org.example.chapter7_arrays.passingArraysToMethods;

import java.util.Arrays;

public class reverseArrayFixed {
    public static void main(String[] args) {

        int [] list = {1, 2, 3, 4, 5};
        //reverse array should be {5, 4, 3, 2, 1}
        int [] reverse = new int[list.length];

        System.out.println("Before: " + Arrays.toString(list));

        for (int i = 0, j = list.length - 1; i < list.length ; i++, j--) {
            //swap list[i] with reverse[j]
            reverse[j] = list[i];
        }

        System.out.println("After: " + Arrays.toString(reverse));
    }
}

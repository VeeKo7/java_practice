package org.example.chapter7_arrays.testArrays;

import java.util.Arrays;

public class ChangingArraySize {

    public static void main(String[] args) {

        int [] myList;
        myList = new int[10];
        System.out.println(Arrays.toString(myList) + " before");
        //sometime later you want to assign a new array to my list
        myList = new int[20];
        System.out.println(Arrays.toString(myList) + " after");

    }
}

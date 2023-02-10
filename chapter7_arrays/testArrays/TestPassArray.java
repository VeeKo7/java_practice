package org.example.chapter7_arrays.testArrays;

/**
 * The program contains 2 methods for
 * swapping elements in an array:
 * 1. swap - fails to swap 2 integers
 * 2. swapFirstTwoInArray successfully swaps
 * */

public class TestPassArray {

    public static void main(String[] args) {
        //create int array
        int [] a = {1, 2};
        //swap elements using the swap method
        System.out.println("Before invoking swap()");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");

        //swap elements using the swapFirstTwoInArray method
        System.out.println("Before invoking swapFirstTwoInArray()");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swapFirstTwoInArray(a);
        System.out.println("After invoking swapFirstTwoInArray()");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    }

    /**
     * swap 2 variables
     * @param n1, n2 - 2 variables
     * */
    public static void swap (int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    /**
     * @param array
     * swap the first 2 elements in array
     * */
    public static void swapFirstTwoInArray (int [] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}

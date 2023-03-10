package org.example.chapter7_arrays.passingArraysToMethods;

public class TestPassArray2 {

    public static void main(String[] args) {

        int [] a = {1, 2};

        //swap elements using the swap method
        System.out.println("Before invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");

        //swap elements using swapFirstTwoInArray method
        System.out.println("Before invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swapFirstTwoInArray(a);
        System.out.println("After invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    }

    //swap two variables
    public static void swap (int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    public static void swapFirstTwoInArray (int [] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}

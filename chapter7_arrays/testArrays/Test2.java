package org.example.chapter7_arrays.testArrays;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverse(new int[] {1, 2, 3, 4, 5})));
    }

    public static int [] reverse (int [] list) {
        //create the same size array
        int [] result = new int[list.length];

        //swapping last i with beginning i
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }

        return result;
    }
}

package org.example.chapter7_arrays.testArrays;

import java.util.Arrays;

public class CodeFix {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 5, 4};
        System.out.println("List: " + Arrays.toString(list));
        int[] reverse = new int[list.length];
        System.out.println("Reverse: " + Arrays.toString(reverse));
        for (int i = 0, j = reverse.length - 1; i < list.length; i++, j--) {
            // Swap list[i] with list[j]
            int temp = list[i];
            list[i] = reverse[j];
            reverse[j] = temp;
        }
        System.out.println("Reverse: " + Arrays.toString(reverse));

    }

}

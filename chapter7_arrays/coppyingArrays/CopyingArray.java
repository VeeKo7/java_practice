package org.example.chapter7_arrays.coppyingArrays;

import java.util.Arrays;

/**
 * Ways to copy arrays:
 * - use loop to copy individual elements one by one
 * - use static arraycopy method in the System class
 * - use the clone method to copy arrays
 * */

public class CopyingArray {
    public static void main(String[] args) {
        //first method to copy arrays
        int [] sourceArray = {2, 3, 1, 5, 10};
        int [] targetArray = new int[sourceArray.length];

        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }

        //second method = arraycopy method in the System class
        //arraycopy(sourceArray, srcPos, targetArray, tarPos, length)
        //srcPos and tarPos indicate the starting positions in the
        //sourceArray and targetArray
        //the number of elements copied from sourceArray to targetArray is
        //indicated by length

        //after the copying takes place, targetArray and sourceArray
        //have the same content but independent memory locations
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
        System.out.println(Arrays.toString(sourceArray));
        System.out.println(Arrays.toString(targetArray));

    }
}

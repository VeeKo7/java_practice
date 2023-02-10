package org.example.chapter7_arrays;

/**
 * Find max and index of max value
 * */

public class ArrayDemo5 {
    public static void main(String[] args) {

        int max = 0;
        int indexOfMax = 0;
        int [] myList = {1, 5, 3, 4, 5, 5};
        for (int i = 0; i < myList.length; i++) {

            //Compare each element in myList with
            //max and update max and indexOfMax
            //if the element is greater than max.
            if (max < myList[i]) {
                max = myList[i];
                //smallest index of max is i
                indexOfMax = i;
            }
        }
        System.out.println("max: " + max);
        System.out.println("index of max: " + indexOfMax);

    }
}

package org.example.chapter7_arrays;

import java.util.Arrays;

public class SelectionSort {
    /**
     * sorting numbers
     * */
    public static void selectionSort(double [] list) {

        for (int i = 0; i < list.length - 1; i++) {
            /*
            * find min in the list[i..list.length - 1]
            * */
            //min number in the list
            double currentMin = list[i];
            //min index
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                /*
                * if currentMin number is greater than
                * number in the list, than assign that
                * number to currentMin & index of that
                * number j assign to currentMinIndex
                * */
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            /*
            * swap list[i] with list[currentMinIndex] if necessary
            * */
            //index is already j
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }

        }
    }
}

class Main {
    public static void main(String[] args) {

        double [] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        SelectionSort.selectionSort(list);
    }
}

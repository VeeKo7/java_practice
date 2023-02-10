package org.example.chapter7_arrays;

/**
 * Random shuffling, random reorder of elements
 * */

public class ArrayDemo6 {

    public static void main(String[] args) {

        double [] myList = {1.0, 5.0, 3.0, 4.0, 9.0, 7.0, 2.0, 6.0, 8.0, 0.0};

        for (int i = 0; i < myList.length; i++) {
            //generate an index j randomly
            int j = (int) (Math.random() * myList.length);
            //swap myList[i] with myList[j]
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
            System.out.println(myList[j]);
        }
    }
}

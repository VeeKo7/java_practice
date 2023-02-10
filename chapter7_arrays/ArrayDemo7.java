package org.example.chapter7_arrays;

/**
 * Shifting elements one position to the left
 * and filling the last element with the first element
 * */

public class ArrayDemo7 {

    public static void main(String[] args) {

        double [] myList = {1.0, 5.0, 3.0, 4.0, 9.0, 7.0, 2.0, 6.0, 8.0, 0.0};

        //retain the first element
        double temp = myList[0];

        //shift elements left
        for (int i = 1; i < myList.length; i++) {
            //we want 0 index to equal to 1
            myList[i - 1] = myList[i];
        }

        //move the first element to fill in the last position
        myList[myList.length - 1] = temp;

    }
}

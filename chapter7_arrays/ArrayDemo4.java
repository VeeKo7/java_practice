package org.example.chapter7_arrays;

/**
 * Find total and max value.
 * */

public class ArrayDemo4 {
    public static void main(String[] args) {

        double [] myList = new double[10];

        //initially max
        double max = myList[0];
        myList[0] = 9.0;
        myList[1] = 1.0;
        myList[2] = 2.0;
        myList[3] = 3.0;
        myList[4] = 4.0;
        myList[5] = 5.0;
        myList[6] = 6.0;
        myList[7] = 7.0;
        myList[8] = 8.0;
        myList[9] = 0.0;

        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total = total + myList[i];

            //if max is less than element in array
            if (max < myList[i]) {
                //update max as that element
                max = myList[i];
            }
        }

        System.out.println("total: " + total);
        System.out.print("max: " + max);

    }
}

package org.example.chapter7_arrays;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        int [] list = {1,2,3,4,5};
        reverse(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void reverse (int [] list) {
        //created a new empty array of same length
        int [] newList = new int[list.length];

//        for (int i = 0; i < list.length; i++) {
//            //5 - 0 - 1 = 4
//            newList[i] = list[list.length - i - 1];
//        }

        //taking what's on the first element in the list
        //and putting it in the last element's place
        for (int i = list.length - 1,  k = 0; i >= 0 && k < list.length; i--, k++) {
            newList[i] = list[k];
        }

        System.arraycopy(newList, 0, list, 0, newList.length);

        System.out.println("newList: " + Arrays.toString(newList));
        System.out.println("list: " + Arrays.toString(newList));
    }
}

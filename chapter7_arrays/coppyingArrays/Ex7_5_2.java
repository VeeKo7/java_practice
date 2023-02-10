package org.example.chapter7_arrays.coppyingArrays;

public class Ex7_5_2 {
    public static void main(String[] args) {

        int [] myList = new int[10];
        int size = myList.length;
        System.out.println("size: " + size);
        myList = new int[20];
        int size2 = myList.length;
        System.out.println("size2: " + size2);
    }
}

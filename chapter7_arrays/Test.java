package org.example.chapter7_arrays;

public class Test {
    public static void main(String[] args) {

        int number = 0;
        int [] numbers = new int[1];

        m(number, numbers);//0, 3
        System.out.println("number is " + number
        + " and number[0] is " + numbers[0]);
    }

    public static void m (int x, int [] y) {
        x = 3;
        y[0] = 3;
    }

}

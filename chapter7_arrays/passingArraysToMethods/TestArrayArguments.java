package org.example.chapter7_arrays.passingArraysToMethods;

public class TestArrayArguments {

    public static void main(String[] args) {
        //x represents an int value
        int x = 1;
        //y represents an array of y values
        int [] y = new int[10];
        //invoke m with arguments x and y
        m(x, y);

        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[0]);

    }

    public static void m (int number, int [] numbers) {
        number = 1001; //assign a new value to a number
        numbers[0] = 5555; //assign a new value to numbers[0]
    }
}

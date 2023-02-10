package org.example.chapter7_arrays.testArrays;

public class TestArrayArgs {
    public static void main(String[] args) {

        //x represents an x value
        int x = 1;
        //y represents an array of int values
        int [] y = new int[10];
        y[0] = 5;
        System.out.println("y[0] is " + y[0]);//y[0] is 5

        //invoke m with arguments x and y
        m(x, y);

        System.out.println("x is " + x);//x is 1
        System.out.println("y[0] is " + y[0]);//y[0] is 5555
    }

    public static void m (int number, int [] numbers) {
        //assign a new value to number
        number = 1001;
        //assign a new value to numbers[0]
        numbers[0] = 5555;
    }
}

package org.example.chapter7_arrays;

/**
 * You can pass an array or a variable number of arguments
 * to a variable-length parameter.
 * */

public class VarArgsDemo {

    public static void main(String[] args) {

        /*
        * passing variable number of args
        * java creates an array and passes
        * the args to it
        * */
        printMax(34, 3, 3, 2, 56.5);
        //passing an array
        printMax(new double[]{1,2,3});
    }

    public static void printMax(double... numbers) {
        if(numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++)
            /*
            * if 2nd number is greater than 1st,
            * than assign 2nd to result
            * */
            if (numbers[i] > result)
                result = numbers[i];

        System.out.println("The max value is " + result);
    }
}

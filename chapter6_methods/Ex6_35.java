package org.example.chapter6_methods;

import java.util.Scanner;

/**
 * Program calculates the area of pentagon
 * */

public class Ex6_35 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.println("The area of the pentagon is: " + area(side));
    }

    /**
     * Calculates the area of pentagon
     * @param side - each side of
     * pentagon is the same
     * @return the area of a pentagon
     */
    public static double area (double side) {

        final double PI = 3.14159;
        double area = (5 * Math.pow(side, 2))/(4 * Math.tan(PI/5));

        return area;
    }

}

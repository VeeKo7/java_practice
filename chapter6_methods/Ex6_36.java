package org.example.chapter6_methods;

import java.util.Scanner;

/**
 * Program calculates the area
 * of polygon.
 * */

public class Ex6_36 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.println("The area of the polygon is: " + area(numberOfSides, side));
    }

    /**
     * Computes the area of polygon
     * @param numberOfSides - user input, side - length
     * @return the area of a regular polygon
     */
    public static double area (int numberOfSides, double side) {

        final double PI = 3.14159;
        double area = (numberOfSides * Math.pow(side, 2))/(4 * Math.tan(PI/numberOfSides));

        return area;
    }
}

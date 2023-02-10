package org.example.chapter6_methods;

/**
 * Program reads 3 sides for a triangle
 * and uses the isValid method to test if
 * the input is valid and uses the area
 * method to obtain the area.
 * */

import java.util.Scanner;

class Ex6_19 {
    public static void main(String[] args) {

        //scanner created + user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers for triangle sides separated with a space, like 4.5: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (!(isValid(side1, side2, side3))) {
            System.out.println("Input is invalid!");
        } else {
            System.out.printf("Area of triangle is: %.2f", area(side1, side2, side3));
        }
    }

    /**
     * @param side1, side2, side3 - triangle sides
     * @return true if the sum of every two
     * sides is greater than the third side.
     */

    public static boolean isValid (double side1, double side2, double side3) {

        if (side1 + side2 > side3) {
            return true;
        } else if (side2 + side3 > side1) {
            return true;
        } else return side3 + side1 > side2;
    }

    /**
     * @param side1, side2, side3 - triangle sides
     * @return the area of the triangle
     */
    public static double area (double side1, double side2, double side3) {

        double s = (side1 + side2 + side3)/2;
        //compute triangle area
        double area =  Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return area;
    }
}

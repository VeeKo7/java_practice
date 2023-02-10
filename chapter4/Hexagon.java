package org.example.chapter4;

import java.util.Scanner;

public class Hexagon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side:");
        //s - length of a side
        double s = input.nextDouble();

        //hexagon area formula
        double area = (6 * (Math.pow(s, 2))) / (4 * (Math.tan(Math.PI/6)));
        System.out.printf("Hexagon area equals to %.2f.", area);
    }
}

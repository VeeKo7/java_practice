package org.example.chapter4;

import java.util.Scanner;

public class PentagonArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex:");
        //r - length from a center to a vertex
        double r = input.nextDouble();
        //s side length
        double s = 2 * r * (Math.sin(Math.PI/5));
        //pentagon area formula
        double area = (5 * (Math.pow(s, 2))) / (4 * (Math.tan(Math.PI/5)));
        System.out.printf("Pentagon area equals to %.2f.", area);
    }
}

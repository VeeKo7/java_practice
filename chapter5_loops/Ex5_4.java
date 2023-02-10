package org.example.chapter5_loops;

/**
 * conversion from miles to km
 * 1 mile = 1.609 km
 * */

public class Ex5_4 {
    public static void main(String[] args) {
        System.out.println("Miles\tKilometers");
        System.out.println("__________________");
        double milesToKm;
        double kmPerMile = 1.609;

        for (int mile = 1; mile <= 10; mile++) {
            milesToKm = mile * kmPerMile;
            System.out.printf("%-8d%.3f\n", mile, milesToKm);
        }
    }
}

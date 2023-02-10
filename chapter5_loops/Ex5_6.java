package org.example.chapter5_loops;

/**
 * Conversion to miles to km
 * and from km to miles.
 * */

public class Ex5_6 {
    public static void main(String[] args) {

        System.out.print("Miles\tKilometers\t");
        System.out.println("Kilometers\tMiles");
        System.out.println("--------------------------------------");
        int km = 20;
        int mile = 1;
        double milesToKm;
        double kmToMiles;
        final double KM_PER_MILE = 1.609;

        while (mile <= 10 && km <= 65) {
            //1 mile = 1.609 km
            milesToKm = mile *  KM_PER_MILE;
            System.out.printf("%-8d%-4.3f\t  |\t", mile, milesToKm);
            mile++;

            kmToMiles = km / KM_PER_MILE;
            System.out.printf("%-8d\t%-4.3f\t\n", km, kmToMiles);
            km += 5;
        }
    }
}

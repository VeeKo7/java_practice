package org.example.chapter6_methods.afterChapterExercises;

/**
 * Conversion between feet and meters
 * */

public class Ex6_9 {

    public static void main(String[] args) {
        printConversionTable();
    }

    /**
     * Converts from feet to meters
     */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
    /**
     * Converts from feet to meters
     */
    public static double metersToFeet(double meter) {
        return 3.279 * meter;
    }

    /**
     * Printing the table out.
     * */
    public static void printConversionTable () {

        System.out.print("Feet\t\tMeter |\t\t");
        System.out.println("Meter\tFeet");
        System.out.println("_______________________________________");

        double foot = 1.0;
        double meter = 20.0;

        while (foot <= 10.0 && meter <= 65.0) {
            System.out.printf("%-4.1f\t%8.3f  |", foot, footToMeter(foot));
            foot++;
            System.out.printf("%9.1f\t%6.3f\n", meter, metersToFeet(meter));
            meter += 5.0;
        }
    }
}

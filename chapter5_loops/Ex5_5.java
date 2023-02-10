package org.example.chapter5_loops;

/**
 * Conversion from kg to pound
 * and pounds to kg.
 * */

public class Ex5_5 {
    public static void main(String[] args) {

        double poundsToKg;
        double kgsToPounds;
        double poundsPerKg = 2.2;
        int kg = 1;
        int pound = 20;

        System.out.print("Kilograms\tPounds\t");
        System.out.println("Pounds\tKilograms");
        System.out.println("_______________________________________");

        while (kg <= 199 && pound <= 515) {
            kgsToPounds = kg * poundsPerKg;
            System.out.printf("%-12d%5.1f", kg, kgsToPounds);
            kg = kg + 2;

            poundsToKg = pound / poundsPerKg;
            System.out.printf("\t%6d %10.2f\n", pound, poundsToKg);
            pound = pound + 5;
        }
    }
}

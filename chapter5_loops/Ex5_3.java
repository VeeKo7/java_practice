package org.example.chapter5_loops;

/**
 * Program displays a table.
 * 1 kg = 2.2 pounds
 * */

public class Ex5_3 {
    public static void main(String[] args) {
        System.out.println("Kilograms\tPounds");
        System.out.println("___________________");
        double kgsToPounds;
        double poundsPerKg = 2.2;

        for (int kg = 1; kg <= 199; kg = kg + 2) {
            kgsToPounds = kg * poundsPerKg;
            System.out.printf("%-12d%8.1f\n", kg, kgsToPounds);
        }
    }
}


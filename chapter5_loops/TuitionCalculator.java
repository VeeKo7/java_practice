package org.example.chapter5_loops;

public class TuitionCalculator {
    public static void main(String[] args) {
        double tuition = 10_000;
        int year = 0;

        while (tuition < 20_000) {
            tuition = tuition * 1.07;
            year++;
        }

        System.out.printf("It will take " + year + " years for the tuition to be %4.2f.", tuition);
    }
}

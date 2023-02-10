package org.example.chapter6_methods.afterChapterExercises;

import java.util.Scanner;

/**
 * Compute the future investment value
 * at a given interest rate for a
 * specified number of years.
 * */

public class Ex6_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double investedAmount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        printTable(investedAmount, annualInterestRate/12);
    }

    /**
     * Computes future investment value
     * @param investmentAmount
     * @param monthlyInterestRate
     * @param year
     * @return futureInvestmentValue
     * */
    public static double futureInvestmentValue (double investmentAmount,
                                                double monthlyInterestRate,
                                                int year) {

        double futureInvestmentValue = 0;


            futureInvestmentValue = investmentAmount *
                    (Math.pow(1 + monthlyInterestRate / 100, year * 12));

        return futureInvestmentValue;
    }

    /**
     * print a table from 1 to 30
     * */
    public static void printTable (double investmentAmount, double monthlyInterestRate) {

        System.out.println("Years\tFuture Value");

        for (int year = 1; year <= 30; year++) {
            System.out.printf("%-8d%8.2f\n",
                    year, futureInvestmentValue(investmentAmount, monthlyInterestRate, year));
        }
    }

}

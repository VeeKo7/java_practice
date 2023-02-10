package org.example.chapter6_methods.afterChapterExercises;

/**
 * Compute commissions and print a table
 * */

public class Ex6_11 {

    public static void main(String[] args) {

        displayCommissionTable();
    }

    /**
     * Computes commission
     * @param salesAmount
     * @return commission
     * */
    public static double computeCommission (double salesAmount) {

        return 5000 * 0.08 + (10000 - 5000) * 0.1
                    + (salesAmount - 10000) * 0.12;
    }

    /**
     * prints a commission table
     */
    public static void displayCommissionTable () {
        System.out.println("Sales Amount\tCommission");
        double salesAmount;
        for (salesAmount = 10000; salesAmount <= 100000; salesAmount = salesAmount + 5000) {
            System.out.printf("%-10.2f\t%11.2f\n", salesAmount, computeCommission(salesAmount));
        }
    }
}

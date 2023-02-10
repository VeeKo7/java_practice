package org.example.chapter6_methods;

public class Ex6_16 {
    public static void main(String[] args) {

        for (int year = 2000; year <= 2020; year++) {

            System.out.println(year + ": " + numberOfDaysInAYear(year));
        }

    }

    /**
     * @param year
     * @return days in a year
     */
    public static int numberOfDaysInAYear(int year) {

        boolean isLeap = (year % 4 == 0)
                && (year % 100 != 0)
                || (year % 400 == 0);

        if (!isLeap)
            return 365;
        else
            return 366;
    }
}

package org.example.chapter6_methods.printCalendar;

import java.util.Scanner;

public class PrintCalendar {

    /**main method
     * */
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);
        //prompt the user to enter a year
        System.out.print("Enter full year: ");
        int year = input.nextInt();
        /*
        * user input validation for the year
        * year has to be after 1800
        * */
        while (year < 1800) {
            System.out.print("Year should be later than 1800. " +
                    "Try again: ");
            year = input.nextInt();
        }

        //create a loop to change a month variable
        for (int month = 1; month < 12; month++) {
            printMonth(year, month);
        }
//        //prompt the user to enter a month
//        System.out.print("Enter month as a number between 1 and 12: ");
//        int month = input.nextInt();
//        /*
//        user input validation
//        * while month is not between 1 and 12,
//        * keep asking for the correct input
//        * from the user
//        * */
//        while (month <= 1 || month >= 12) {
//            System.out.print("Month should be between " +
//                    "1 and 12. Try again: ");
//            month = input.nextInt();
//        }

        //print calendar for the month of the year

    }

    //printMonth
    public static void printMonth (int year, int month) {
        //print the headings of the calendar
        printMonthTitle(year, month);
        //print the body of the calendar
        printMonthBody(year, month);
    }

    //printMonthTitle
    public static void printMonthTitle (int year, int month) {
        System.out.println("          " + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    //getMonthName
    public static String getMonthName (int month) {

        String monthName = "";

        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
        }

        return monthName;
    }

    //printMonthBody
    public static void printMonthBody (int year, int month) {
        //get start day of the week for the first date in the month
        int startDay = getStartDay(year, month);
        //get number of days in the month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
        //pad space before the first day of the month
        int i = 0;
        for (i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
            }
        System.out.println();
        }


    /**
     * getStartDay()
     * Sunday - 0
     * Monday - 1
     * Tuesday - 2
     * Wednesday - 3
     * Thursday - 4
     * Friday - 5
     * Saturday - 6
     * */
    public static int getStartDay (int year, int month) {
        //January 1, year: 1800 is a Wednesday
        final int START_DAY_FOR_JAN_1_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year, month);
        //return the start day for month/1/year
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    /**
     * getTotalNumberOfDays()
     * */
    public static int getTotalNumberOfDays (int year, int month) {
        int total = 0;
        //get total days from 1800 to 1/1/year e.g.
        //2023 - 1800 = dependent on leap year or not
        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i))
                total = total + 366;
            else
                total = total + 365;
        }

        //add days from Jan to the month prior to
        //the calendar month ###prior to what calendar month?
        //1 2 3 4 5 6 7 8 9 10 11
        //###why i < month when there is 12 months in a year not 11?
        for (int i = 1; i < month; i++) {
            total = total + getNumberOfDaysInMonth(year, i);
        }

        return total;
    }

    /**
     * getNumberOfDaysInMonth()
     */
    public static int getNumberOfDaysInMonth (int year, int month) {

        /**
         * grouped months to return 31, 30, 28/29 days in those months
         */
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;

        }
        return month;//Am I returning the correct value?
    }

    /**
     * isLeapYear() returns leap year
     * */
    public static boolean isLeapYear (int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

}

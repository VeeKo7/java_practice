package org.example.chapter6_methods.afterChapterExercises;

/**
 * Conversion between Celsius and Fahrenheit
 * */

public class Ex6_8 {

    public static void main(String[] args) {
        printConversionTable();
    }

    /**
     * Conversion from Celsius to Fahrenheit
     * */
    public static double celsiusToFahrenheit (double celsius) {
        //formula to find out fahrenheit knowing celsius
        return (9.0 / 5) * celsius + 32;
    }

    /**
     * Conversion from Fahrenheit to Celsius
     * */
    public static double fahrenheitToCelsius (double fahrenheit) {
        //formula to find out celsius knowing fahrenheit
        return (5.0 / 9) * (fahrenheit - 32);
    }

    /**
     * Printing the table out.
     * */
    public static void printConversionTable () {

        System.out.print("Celsius\tFahrenheit\t");
        System.out.println("Fahrenheit\tCelsius");
        System.out.println("_______________________________________");

        double celsius = 40.0;
        double fahrenheit = 120.0;

        while (celsius >= 31.0 && fahrenheit >= 30.0) {
            System.out.printf("%4.1f\t%8.1f   |", celsius, celsiusToFahrenheit(celsius));
            celsius--;

            System.out.printf("%9.1f\t%6.2f\n", fahrenheit, fahrenheitToCelsius(fahrenheit));
            fahrenheit -= 10;
        }
    }
}

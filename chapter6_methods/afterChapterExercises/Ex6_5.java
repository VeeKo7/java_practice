package org.example.chapter6_methods.afterChapterExercises;

/**
 * Sorting three numbers in increasing order
 **/
public class Ex6_5 {

    public static void main(String[] args) {

        displaySortedNumbers(3.4, 7.9, 5.6);
    }

    public static void displaySortedNumbers (double num1,
                                             double num2,
                                             double num3) {

        //found min number
        double min = Math.min(num3, Math.min(num1, num2));
        //found max number
        double max = Math.max(num3, Math.max(num1, num2));
        //found mid
        double mid = 0;
        if (num1 != min && num1 != max) {
            mid = num1;
        }

        if (num2 != min && num2 != max) {
            mid = num2;
        }

        if (num3 != min && num3 != max) {
            mid = num3;
        }

        System.out.println(min + ", " + mid + ", " + max);

    }
}

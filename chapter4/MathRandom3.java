package org.example.chapter4;

public class MathRandom3 {
    public static void main(String[] args) {
        double min = 5.5;
        double max = 55.5;
        double doubleNumber = (max - min) + 1;
        double randomNumber = Math.random() * doubleNumber + min;

        System.out.printf("%.2f", randomNumber);
    }
}

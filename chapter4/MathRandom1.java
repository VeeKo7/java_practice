package org.example.chapter4;

public class MathRandom1 {
    public static void main(String[] args) {
        /*
        * 4.2.5 Write an expression that obtains a random integer between 34 and 55.
        * */
        int min = 34;
        int max = 55;
        int rangeForDecimal = (max - min) + 1;
        int randomNumber = (int)(Math.random() * rangeForDecimal) + min;

        if(randomNumber >= 34 && randomNumber <= 55) {
            System.out.println(randomNumber);
        } else {
            System.out.println("Error.");
        }
    }
}

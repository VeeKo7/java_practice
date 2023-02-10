package org.example.chapter4;

public class MathRandom2 {
        public static void main(String[] args) {
            /*
             * 4.2.5 Write an expression that
             * obtains a random integer between 0 and 999.
             * */
            int randomNumber = (int)(Math.random() * 1000);

            if(randomNumber >= 0 && randomNumber <= 999) {
                System.out.println(randomNumber);
            } else {
                System.out.println("Error.");
            }
        }
}

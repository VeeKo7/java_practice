package org.example.chapter6_methods.afterChapterExercises;

/**
 * (Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
 * isPrime(int number) method for testing whether a number is prime. Use
 * this method to find the number of prime numbers less than 10000.
 * */

//finish

public class Ex6_10 {

    public static void main(String[] args) {

        int primeNumbersCount = 0;

        for (int i = 2; i <= 10000; i++) {

            //if it is prime number then
            //we need to add primeNumbersCount
             if (isPrime(i)) {
                 primeNumbersCount++;
             }
        }

        System.out.println("The count of prime numbers is: "
                + primeNumbersCount);
    }



    public static boolean isPrime (int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            //if true, number is not prime
            if (number % divisor == 0) {
                //number is not prime
                return false;
            }
        }
        //number is prime
        return true;
    }
}

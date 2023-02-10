package org.example.chapter6_methods;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        //display 10 per line
        final int NUMBERS_OF_PRIME_PER_LINE = 10;
        //count the number of prime numbers
        int count = 0;
        //a number to be tested for primeness
        int number = 2;

        //repeatedly find prime numbers
        while (count < numberOfPrimes) {
            //print the prime number and increase the count
            if (isPrime(number)) {
                count++;

                if (count % NUMBERS_OF_PRIME_PER_LINE == 0) {
                    //print the number and advance to the new line
                    System.out.printf("%-5d\n", number);
                } else {
                    System.out.printf("%-5d", number);
                }
            }
            //check whether the next number is prime
            number++;
        }
    }

    //check whether number is prime
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number/2; divisor++) {
            //if true, number is not prime
            if (number % divisor == 0) {
                return false;
            }
        }
        //number is prime
        return true;
    }
}

package org.example.chapter5_loops;

public class Ex5_20 {
    public static void main(String[] args) {
        //number of primes to display
        final int NUMBERS_OF_PRIMES = 1000;
        //display 8 per line
        final int NUMBER_OF_PRIMES_PER_LINE = 8;
        //count the number of prime numbers
        int count = 0;
        //a number to be tested for primeness
        int number = 2;

        System.out.println("The first 50 prime numbers are \n");

        //repeatedly find prime numbers
        while (count < NUMBERS_OF_PRIMES) {
            //assume the number is prime
            boolean isPrime = true;

            //test whether number is prime
            for (int divisor = 2; divisor < number; divisor++) {
                //if true, number is not prime
                if (number % divisor == 0) {
                    isPrime = false;
                    //exit the loop
                    break;
                }
            }

            //display the prime number and increase the count
            if (isPrime) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    //display the number and advance to the new line
                    System.out.println(number);
                } else
                    System.out.print(number + " ");
            }
            //check if the next number is prime
            number++;
        }
    }
}

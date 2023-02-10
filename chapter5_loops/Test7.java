package org.example.chapter5_loops;

public class Test7 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {

            if (number != 10 && number != 11)
                    sum += number;
            number++;
        }

        System.out.println("The sum is " + sum);
    }
}

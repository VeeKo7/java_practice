package org.example.chapter5_loops;

/**
 * need to find the smallest factor other than 1 for n (assume n >= 2)
 * */

public class BreakStatement {

    public static void main(String[] args) {

        int n = 2;
        int factor = 2;
        //with break
        while (factor <= n) {
            if (n % factor == 0)
                break;
            factor++;
        }
        System.out.println("The smallest factor other than 1 for " + n + " is " + factor);

        boolean found = false;
        int factor2 = 2;
        while (factor2 <= n && !found) {
            if (n % factor2 == 0)
                found = true;
            else
                factor2++;
        }
        System.out.println("The smallest factor other than 1 for " + n + " is " + factor2);
    }
}

/*
*   int factor = 2;
    while (n % factor != 0)
        factor++;
or
    for (int factor = 2; n % factor != 0; factor++);
* */

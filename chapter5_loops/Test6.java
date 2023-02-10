package org.example.chapter5_loops;

public class Test6 {
    public static void main(String[] args) {

        int i = 0, sum = 0;

        while (i < 4) {
            if (i % 3 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("sum: " + sum);
    }
}

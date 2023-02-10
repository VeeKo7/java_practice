package org.example.chapter5_loops;

public class WhileLoop2 {
    public static void main(String[] args) {

        int sum = 0, i = 1;
        while (i < 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum is " + sum);
    }
}

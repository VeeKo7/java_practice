package org.example.chapter7_arrays;

public class Ex7_2_10 {

    public static void main(String[] args) {

        double[] r = new double[100];

        for (int i = 0; i < r.length; i++) {
            r[i] = Math.random() * 100;
            System.out.println(r[i]);
        }
    }
}

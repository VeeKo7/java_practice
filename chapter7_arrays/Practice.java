package org.example.chapter7_arrays;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {


//        double [] d = new double[10];
//        d[d.length - 1] = 5.5;
//        double sum = d[0] + d[1];
//        System.out.println(sum);
//
//        double total = 0.0;
//        for (double e : d ) {
//            total += e;
//        }
//
//        double min = d[0];
//        for (double e : d ) {
//            if (min > e) {
//                min = e;
//            }
//        }
//
//        System.out.println(total);
//
//        double r = Math.random();
//        int v = (int)(r * d.length - 1);
//        System.out.println(d[v]);
//
//        double [] b = {3.5, 5.5, 4.52, 5.6};
        int [] list = {1, 2, 3, 4, 5, 6};

        for (int i = 1; i < list.length; i++) {
            //2 = 1
            //3 = 1
            list[i] = list[i - 1];
        }
        System.out.println();

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

    }
}

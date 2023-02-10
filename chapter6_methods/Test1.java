package org.example.chapter6_methods;

public class Test1 {
        public static void main(String[] args) {
            int max = 0;
            max(1, 2, max);
            System.out.println(max);
        }

        public static void max(
                int value1, int value2, int max) {
            if (value1 > value2)
                max = value1;
            else
                max = value2;
        }
}
//printed only int max , which is 0
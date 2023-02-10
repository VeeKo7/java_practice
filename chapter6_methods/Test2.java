package org.example.chapter6_methods;

public class Test2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 6) {// 1 2 3 4 5 6
            method1(i, 2);
            i++;
        }
    }

    public static void method1(int i, int num) {
        for (int j = 1; j <= i; j++) {// 1 2 3 4 5 6
            System.out.print(num + " ");
            num = num * 2;
        }
        System.out.println();
    }
}

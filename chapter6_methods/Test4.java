package org.example.chapter6_methods;

public class Test4 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 4) {
            method1(i);
            i++;
        }
        System.out.println("i is " + i);
    }

    public static void method1(int i) {//0 1 2 3 4
        do {
            if (i % 3 != 0)// 0/3=0 false 1/3=0.3 false 2/3=0.6 false 3/3=1.3 true 4/3=1.6 true
                System.out.print(i + " ");// 0 1 2 4
            i--;
        }
        while (i >= 1);
        System.out.println();
    }
}

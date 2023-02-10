package org.example.chapter4;

public class StringConcatDemo2 {
    public static void main(String[] args) {
        System.out.println(1 + "Welcome " + 1 + 1);
        System.out.println(1 + "Welcome " + (1 + 1));
        System.out.println(1 + "Welcome " + ('\u0001' + 1));
        System.out.println(1 + "Welcome " + 'a' + 1);
    }
}

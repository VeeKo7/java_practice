package org.example.chapter7_arrays.coppyingArrays;

public class Ex7_5_1 {
    public static void main(String[] args) {

        int [] source = {3, 4, 5};

        for (int i = 0; i < source.length; i++) {
            System.out.print(source[i] + " ");
        }

        System.out.println();

        int [] target = {0, 0, 0};

        for (int i = 0; i < target.length; i++) {
            System.out.print(target[i] + " ");
        }

        System.arraycopy(source, 0, target, 0, source.length);

        System.out.println("\nAfter copying target array. ");

        for (int i = 0; i < source.length; i++) {
            System.out.print(source[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < target.length; i++) {
            System.out.print(target[i] + " ");
        }
    }
}

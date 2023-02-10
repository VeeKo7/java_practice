package org.example.chapter5_loops;

public class ForLoopEx2 {
    public static void main(String[] args) {

        int i = 0;
            while (i < 5) {
                for (int j = i; j > 1; j--) {
                    System.out.println(j + " ");
                }
                System.out.println("****");
            }
            System.out.println();
    }
}

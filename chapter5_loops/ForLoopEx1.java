package org.example.chapter5_loops;

public class ForLoopEx1 {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {//1 2 3 4 5
            int j = 0;
            while (j < i) {//0<1, 1<2 etc
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }
    }
}

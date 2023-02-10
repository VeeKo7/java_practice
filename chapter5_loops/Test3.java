package org.example.chapter5_loops;

public class Test3 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            if ((i++) % 2 == 0)//2 > 3
                System.out.println(i);
        }
    }
}

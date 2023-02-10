package org.example.chapter2test;

public class Test13 {
    public final static void main(String... args) {

        int pterodactyl = 8;
        long triceratops = 3;
        if (pterodactyl % 3 > 1 + 1)//8 % 3 > 1 + 1 > 2 > 2
            triceratops++;
            triceratops--;//3-- > 2
        System.out.print(triceratops);
    }
}

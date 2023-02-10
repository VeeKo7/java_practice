package org.example.chapter2test;

public class Test15 {
    public static void main(String[] args) {

    }

    public void magic() {
        int trick = 0;
        int i = 2;
        LOOP: do {
             do {
                trick++;
                } while (trick < i--);
            continue LOOP;
            } while (1 > 2);
        System.out.println(trick);
        }
}

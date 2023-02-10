package org.example.chapter2test;

public class Test23 {
    public static void main(String[] args) {
        boolean balloonInflated = false;
        do {
            if (!balloonInflated) {//false
                balloonInflated = true;
                System.out.print("inflate-");
            }
        } while (! balloonInflated);//true
        System.out.println("done");
    }
}

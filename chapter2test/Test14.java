package org.example.chapter2test;

public class Test14 {

    public static void main(String[] args) {

        int colorOfRainbow = 10;
        final int red = 5;

        switch (colorOfRainbow) {
            default:
                System.out.println("Home");
                break;
            case red:
                System.out.println("Away");
        }
    }
}

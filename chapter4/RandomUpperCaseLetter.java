package org.example.chapter4;

public class RandomUpperCaseLetter {
    public static void main(String[] args) {
        //A - 65, Z - 90
        int capA = 65;
        int capZ = 90;
        int randomNumber = (int)(Math.random() * (capZ - capA) + capA);

        System.out.println("randomNumber: " + randomNumber);

        //convert number to char
        char ch = (char)randomNumber;
        System.out.println("ch: " + ch);
    }
}

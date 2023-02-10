package org.example.chapter4;

public class SubstringDemo {
    public static void main(String[] args) {
        String message = "Welcome to Java";
        message = message.substring(0,11) + "HTML";
        System.out.println("The string message now becomes Welcome to HTML");
    }
}

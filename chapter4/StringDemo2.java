package org.example.chapter4;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = "Welcome to Java";
        System.out.println(str);
        System.out.println("Welcome to Java".indexOf('W'));//0
        System.out.println("Welcome to Java".indexOf('o'));//4
        System.out.println("Welcome to Java".indexOf('o', 5));//9
        System.out.println("Welcome to Java".indexOf("come"));//3
        System.out.println("Welcome to Java".indexOf("Java", 5));//11
        System.out.println("Welcome to Java".indexOf("java", 5));//-1
        System.out.println("***");
        System.out.println("Welcome to Java".lastIndexOf('W'));//0
        System.out.println("Welcome to Java".lastIndexOf('o'));//9
        System.out.println("Welcome to Java".lastIndexOf('o', 5));//4
        System.out.println("Welcome to Java".lastIndexOf("come"));//3
        System.out.println("Welcome to Java".lastIndexOf("Java", 5));//-1
        System.out.println("Welcome to Java".lastIndexOf("Java"));//11

    }
}

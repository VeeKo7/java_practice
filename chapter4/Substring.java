package org.example.chapter4;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter second string: ");
        String s2 = input.nextLine();

        if (s1.contains(s2)) {
            System.out.print(s2 + " is part of  " + s1);
        } else {
            System.out.print(s2 + "is not part of  " + s1);
        }
    }
}

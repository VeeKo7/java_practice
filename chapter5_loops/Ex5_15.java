package org.example.chapter5_loops;

public class Ex5_15 {
    public static void main(String[] args) {
        char ch;

        //display the ASCII character table
        System.out.println("ASCII character table");
        System.out.println("---------------------");
        System.out.println("\tChar\tNumber");
        for (int i = 33; i <= 47; i++) {
            ch = (char)i;
            System.out.println("\t" + i + "\t\t  " + ch);
        }
    }
}

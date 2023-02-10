package org.example.chapter5_loops;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        //user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        //convert decimal to hex
        String hex = "";
        int count = 0;

        while (decimal != 0) {
            int hexValue = decimal % 16;//123%16=7.6875, 16*7=112, 123-112=11
            System.out.println("hexValue " + hexValue);
            //convert a decimal value to a hex digit
            char hexDigit = (0 <= hexValue && hexValue <= 9) ?//11
                    (char)(hexValue + '0'):(char)(hexValue - 10 + 'A');//1 + 'A' = 'B'
            hex = hexDigit + hex;//hexDigit = 'B' 66 + ""
            System.out.println("hex " + hex);
            decimal = decimal / 16;
            System.out.println("decimal " + decimal);
            count++;
        }
        //infinite loop
//        while (decimal == 0) {
//            System.out.println(" zero hex "+ hex);
//        }
        System.out.println("count: " + count);
    }
}

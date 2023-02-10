package org.example.chapter4;

import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        //user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String userInput = input.next();
        //convert String to char
        char ch = userInput.charAt(0);
        boolean isLowerCase = Character.isLowerCase(ch);

        if(isLowerCase) {
            ch = Character.toUpperCase(ch);
            //System.out.println("ch: " + ch);
        }

        String str = String.valueOf(ch);
        //System.out.println("str: " + str);

        switch(str) {
            case "0":
                str = str.replaceAll("0", "0000");
                System.out.println(str);
                break;
            case "1":
                str = str.replaceAll("1", "0001");
                System.out.println(str);
                break;
            case "2":
                str = str.replaceAll("2", "0010");
                System.out.println(str);
                break;
            case "3":
                str = str.replaceAll("3", "0011");
                System.out.println(str);
                break;
            case "4":
                str = str.replaceAll("4", "0100");
                System.out.println(str);
                break;
            case "5":
                str = str.replaceAll("5", "0101");
                System.out.println(str);
                break;
            case "6":
                str = str.replaceAll("6", "0110");
                System.out.println(str);
                break;
            case "7":
                str = str.replaceAll("7", "0111");
                System.out.println(str);
                break;
            case "8":
                str = str.replaceAll("8", "1000");
                System.out.println(str);
                break;
            case "9":
                str = str.replaceAll("9", "1001");
                System.out.println(str);
                break;
            case "A":
                str = str.replaceAll("A", "1010");
                System.out.println(str);
                break;
            case "B":
                str = str.replaceAll("B", "1011");
                System.out.println(str);
                break;
            case "C":
                str = str.replaceAll("0", "1100");
                System.out.println(str);
                break;
            case "D":
                str = str.replaceAll("0", "1101");
                System.out.println(str);
                break;
            case "E":
                str = str.replaceAll("0", "1110");
                System.out.println(str);
                break;
            case "F":
                str = str.replaceAll("F", "1111");
                System.out.println(str);
                break;
            default:
                System.out.println(userInput + " is an invalid input.");
        }
    }
}

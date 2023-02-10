package org.example.chapter6_methods;

import java.util.Scanner;

public class HexToDecimal {
    public static void main (String [] args) {
        //created scanner
        Scanner input = new Scanner(System.in);

        //user input
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        //displaying result
        System.out.println("The decimal value for hex number "
                + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }

    /**
     * method returns int
     * @param hex
     * method converts hex to decimal
     * */
    public static int hexToDecimal(String hex) {

        int decimalValue = 0;
        //AB8C, length of AB8C is 4
        for (int i = 0; i < hex.length(); i++) {//0 1 2 3
            //get char (A then B then 8 then C) of hex and pass it to char hexChar
            char hexChar = hex.charAt(i);
            //0 = 0 * 16 + hexToDecimal(A) 10
            //10 = 10 * 16 + hexToDecimal(B) 11
            //171 = 171 * 16 + hexToDecimal(8) 8
            //2744 = 2744 * 16 + hexToDecimal(C) 12 > 43916
            decimalValue = decimalValue * 16 + hexToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexToDecimal (char ch) {
        if(ch >= 'A' && ch <= 'F') {
            //10 + 'A' - 'A' = 10, 10 + 'B' - 'A' = 11, 10 + 'C' - 'A' = 12
            return 10 + ch - 'A';
        } else {
            return ch - '0';
        }
    }
}

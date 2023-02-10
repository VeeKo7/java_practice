package org.example.chapter6_methods;

import java.util.Scanner;

public class Ex6_18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.next();
        if (!isValidPassword(password)) {
            System.out.println("Invalid Password");
        } else {
            System.out.println("Valid Password");
        }
    }

    /**
     * check if password is valid
     * @return if password is valid or not
     * */
    public static boolean isValidPassword (String password) {

        //at least 8 chars Password
        if (password.length() < 8) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            //contain only letters and digits
            if (!(Character.isLetter(ch) || Character.isDigit(ch))) {
                return false;
            }
        }

        int countOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            //contain at least 2 digits
            if (Character.isDigit(ch)) {
                countOfDigits++;
            }
            if (countOfDigits >= 2) {
                return true;
            }
        }
        return false;
    }
}



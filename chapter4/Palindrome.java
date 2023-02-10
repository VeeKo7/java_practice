package org.example.chapter4;

public class Palindrome {
    public static void main(String[] args) {
        //random number
        int randomNumber = (int)(Math.random() * 1000);//121
        System.out.println("randomNumber: " + randomNumber);

        //convert randomNumber into a String
        String randomNumToStr = String.valueOf(randomNumber);
        //System.out.println("randomNumToStr: " + randomNumToStr);

        //create an empty String
        String reverseString = "";

        //loop through randomNumToStr and add result to a reverseString
        for (int i = randomNumToStr.length() - 1; i >= 0; i--) {//1 2 3
            reverseString = reverseString + randomNumToStr.charAt(i);
        }
        //System.out.println("reverseString: " + reverseString);
        randomNumber = Integer.parseInt(randomNumToStr);

        //if reverseString = randomNumToStr then
        //convert randomNumToString into integer
        //and display result that is palindrome.
        if(reverseString.equals(randomNumToStr)) {
            randomNumber = Integer.parseInt(randomNumToStr);
            System.out.println(randomNumber + " is a palindrome.");
        } else {
            System.out.println(randomNumber + " is not a palindrome.");
        }
    }
}

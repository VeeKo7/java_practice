package org.example.chapter6_methods.afterChapterExercises;

public class Ex6_2 {

    public static void main(String[] args) {
        System.out.println(sumDigits(236464645454554L));
    }

    public static int sumDigits (long n) {

        //converted long to string
        String longToStr = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < longToStr.length(); i++) {
            //grabbing char from string
            char ch = longToStr.charAt(i);
            //converting to int
            //cannot convert char to int directly
            int num = Integer.parseInt(String.valueOf(ch));
            sum += num;
        }
        return sum;
    }
}

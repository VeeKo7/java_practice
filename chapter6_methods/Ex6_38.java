package org.example.chapter6_methods;

public class Ex6_38 {
    public static void main(String[] args) {

        final int UPPERCASE_LETTERS = 100;
        final int SINGLE_DIGITS = 100;
        final int LETTERS_PER_LINE = 50;
        final int DIGITS_PER_LINE = 50;

        //Print random characters between 'A' - 'Z', 50 per line
        for (int i = 0; i < UPPERCASE_LETTERS; i++) {
            char ch = RandomCharacter2.getRandomUpperCaseLetter();

            if ((i + 1) % LETTERS_PER_LINE == 0) {
                System.out.println(ch);
            } else
                System.out.print(ch + " ");
        }

        //Print random characters between '0' - '9', 50 per line
        for (int i = 0; i < SINGLE_DIGITS; i++) {
            char ch = RandomCharacter2.getRandomDigitCharacter();

            if ((i + 1) % DIGITS_PER_LINE == 0) {
                System.out.println(ch);
            } else
                System.out.print(ch + " ");
        }
    }
}

class RandomCharacter2 {

    //generate a random character between ch1 and ch2
    public static char getRandomCharacter (char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    //generate a random lowercase letter
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    //generate a random uppercase letter
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    //generate a random digit character
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    //generate a random character
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}

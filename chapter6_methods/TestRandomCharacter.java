package org.example.chapter6_methods;

public class TestRandomCharacter {

    public static void main(String[] args) {

        //number of characters is 175
        final int NUMBER_OF_CHARS = 175;
        //characters per line
        final int CHARS_PER_LINE = 25;

        //print random characters between 'a' and 'z',
        //25 per line
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            //we need to get lowercase letter
            char ch = RandomCharacter2.getRandomLowerCaseLetter();
            //25 chars per line from 1 to 25
            if ((i + 1) % CHARS_PER_LINE == 0) {
                //if 25 chars per line
                //then jump on to the next line
                System.out.println(ch);
            }
            else
                //otherwise keep printing on the same line
                System.out.print(ch);
        }
    }
}

class RandomCharacter {

    //generate a random character between ch1 and ch2
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    //generate a random lowercase letter
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    //generate a random uppercase letter
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'B');
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

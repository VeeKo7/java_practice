package org.example.chapter7_arrays;

/**
 * Program counts the occurrences of each letter
 * in an array of characters.
 * */

public class CountLettersInArray {
    public static void main(String[] args) {
        //declare and create an array
        char [] chars = createArray();

        //display the array
        System.out.println("The lowercase letters are: ");
        displayArray(chars);

        //count the occurrences of each letter
        int [] counts = countLetters(chars);

        //display counts
        System.out.println();
        System.out.println("The occurrence of each letter are: ");
        displayCount(counts);

    }

    /**
     * creates an array of characters
     * @return chars
     * */
    public static char [] createArray () {
        //declare an array of characters & initialize it, length 100 0-99
        char [] chars = new char [100];
        //create lowercase letters randomly
        //and assign them to the array
        for (int i = 0; i < chars.length; i++) {
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        }
        //return array
        return chars;
    }

    /**
     * displays the array of lowercase letters
     * randomly generated
     * @param chars - array
     * */
    public static void displayArray (char[] chars) {
        //display the characters in the array
        for (int i = 0; i < chars.length ; i++) {
            //20 per line
            if ((i + 1) % 20 == 0) {//20 % 20 == 0
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i] + " ");
            }
        }
    }

    /**
     * counts the occurrences of each letter
     * @param chars - array with 100 characters
     * @return counts - new array of 26 for counting chars []
     * */
    public static int [] countLetters (char [] chars) {
        /*
        * declare and create an array of 26 int
        * */
        int [] counts = new int [26];

        //for each lowercase letter in the array, count it
        for (int i = 0; i < chars.length; i++) {//0 - 99
            /*
            * count[0] counts number of 'a'
            * count[1] counts number of 'b'
            * if chars[i] is counts['a' = 'a'] - 'a' counts[0]
            * if chars[i] is counts['b' = 'b'] - 'a' counts[1]
            * since unicode of b is 1 more than a
            * if z = counts['z' - 'a'] counts[25]
            * since unicode of z is 25 more than that of a
            * */
            int index = chars[i] - 'a';
            //putting counted letters into counts
            //and assigning them to variable
            int letterCount = counts[index];
            letterCount++;//increased count
            counts[index] = letterCount;//checking next letter?
        }
        return counts;
    }

    /**
     * displays counts
     * @param counts with counted letters from chars
     * */
    public static void displayCount (int [] counts) {
        for (int i = 0; i < counts.length; i++) {
            /*
            * 0 + 'a' = 'a', 1 + 'a' = 'b', 2 + 'a' = 'c', 3 + 'a' = 'd' etc
            * */
                System.out.println((char) (i + 'a') + " = " + counts[i]);
        }
    }
}


class RandomCharacter {

    /**
     * generates a random character between ch1 and ch2
     * @param ch1, ch2 characters from and to
     * @return randomly generated char from ch1 to ch2
     * */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /**
     * generates a random lowercase letter
     * @return char from 'a' to 'z'
     * */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    /**
     * generates a random uppercase letter
     * @return char from 'A' to 'Z'
     * */

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /**
     * generates a random digit character
     * @return char from '0' to '9'
     * */

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    /**
     * generates a random character
     * @return char from '\u0000' to '\uFFFF'
     * */

    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}

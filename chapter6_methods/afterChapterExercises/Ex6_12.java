package org.example.chapter6_methods.afterChapterExercises;

public class Ex6_12 {

    public static void main(String[] args) {
        printChars((char) 33, (char) 64, 5);
    }

    /**
     * printChars
     * @param ch1
     * @param ch2
     * @param numberPerLine
     * */
    public static void printChars (char ch1, char ch2,
                                   int numberPerLine) {
        numberPerLine = 10;

        for (int i = ch1; i <= ch2; i++) {
            if (i % numberPerLine == 0) {
                System.out.printf("%4c\n", (char) i);
            } else {
                System.out.printf("%c", (char) i);
            }
        }
    }
}

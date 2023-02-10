package org.example.chapter7_arrays.passingArraysToMethods;


public class DeckOFCardsTest {

    public static void main(String[] args) {

        System.out.println("number  rank index");
        for (int i = 0; i < 52; i++) {
            System.out.println(i + "       " + (i % 13));
        }
    }
}

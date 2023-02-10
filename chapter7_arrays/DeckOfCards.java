package org.example.chapter7_arrays;

/**
 * randomly select 4 deck of cards
 * from the deck of cards 0 - 52
 * 0 - 12 spades, 13 - 25 hearts,
 * 26 - 38 diamonds, 39 - 51 clubs
 * cardNumber / 13 determines suit
 * cardNumber % 13 determines rank
 * */

public class DeckOfCards {

    public static void main(String[] args) {

        //create a deck of cards 52 long
        int [] deck = new int[52];
        //create suits
        String [] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        //create rank
        String [] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        //initialize cards
        for (int i = 0; i < deck.length; i++) {
            //0 - 51
            deck[i] = i;
        }

        //shuffle the cards
        for (int i = 0; i < deck.length; i++) {

            //generate an index randomly
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
            System.out.println("Shuffled cards: " + deck[i]);
            System.out.println("Index deck: " + deck[index]);
        }

        //display the first 4 cards
//        for (int i = 0; i < 4; i++) {
//            String suit = suits[deck[i]/13];//?
//            String rank = ranks[deck[i]%13];//?
//            System.out.println("Card number " + deck[i] + ": "
//                    + rank + " of " + suit);
//        }

        for (int i = 0; i < 4; i++) {
            //generated card number randomly
            int cardNumber = (int)(Math.random() * deck.length);
            //getting suit out of suits []
            String suit = suits[cardNumber/13];
            //getting rank out of ranks []
            String rank = ranks[cardNumber%13];
            System.out.println("Card number " + deck[i] + ": "
                    + rank + " of " + suit);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package WarCardGame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bhara
 */
public class Cardgame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Card[] hand = new Card[7];
        Random random = new Random();
        for (int i = 0; i < hand.length; i++) 
        {
//            int value = random.nextInt(13)+1;
//            String suit = Card.SUITS[random.nextInt(4)];
            Card.Value value = Card.Value.values()[random.nextInt(Card.Value.values().length)];
            Card.Suit suit = Card.Suit.values()[random.nextInt(Card.Suit.values().length)];

            
            Card card = new Card(value, suit);
            hand[i] = card;
        }
        //print each card so we can see what was generated
        for (Card card : hand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }

        //ask user for Card
        System.out.println("Please choose a suit for your lucky card:");
//        for (int i = 0; i < Card.SUITS.length; i++) {
//            System.out.println((i + 1) + ": " + Card.SUITS[i]);
//        }
        Card.Suit[] suits = Card.Suit.values();
        for (int i = 0; i < suits.length; i++) {
            System.out.println((i + 1) + ": " + suits[i]);
        }
        
        int suit = input.nextInt();
        System.out.println("Enter a value (1 to 13)");
        int value = input.nextInt();
        //create new Card with the two values chosen
//        Card userGuess = new Card(value,Card.SUITS[suit-1]);
//
 Card userGuess = new Card(Card.Value.values()[value], Card.Suit.values()[suit]);
       
 //check if it matches
        boolean match = false;
        for (Card card : hand) {
            if (card.getValue() == userGuess.getValue()
                    && (card.getSuit().equals(userGuess.getSuit()))) {
                match = true;
                break;
            }
        }
        System.out.println("Did you guess it? " + match);
    
    }
}

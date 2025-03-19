/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WarCardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author bhara
 */
public final class Deck {
    
    private final List<Card> deck; // Encapsulated deck of cards

    /**
     * Constructor to create a standard 52-card deck.
     */
    public Deck() {
        deck = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Value value : Card.Value.values()) {
                deck.add(new Card(value, suit));
            }
        }
        shuffle(); // Automatically shuffle deck on creation
    }

    /**
     * Shuffles the deck randomly.
     */
  public void shuffle() {
    if (!deck.isEmpty()) {
        Collections.shuffle(deck);
    }
}


    /**
     * Draws a card from the top of the deck.
     * @return Card object or null if the deck is empty.
     */
    public Card drawCard() {
        if (!deck.isEmpty()) {
            return deck.remove(0);
        }
        return null; // No cards left
    }

    /**
     * Returns the number of cards left in the deck.
     * @return int - size of deck.
     */
    public int remainingCards() {
        return deck.size();
    }
}

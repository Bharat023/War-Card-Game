/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WarCardGame.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author bhara
 * * Singleton class representing a standard 52-card deck.
 * 
 * Design Patterns Used:
 * - Singleton: Ensures only one instance of Deck exists.
 * - Factory: Deck class acts like a simple factory to create Cards.
 * 
 * SOLID Principles:
 * - SRP: Deck class only handles deck operations.
 * - OCP: Can add new shuffle algorithms without changing drawCard().
 * - DIP: Deck could implement an IDeck interface if needed.
 */
public final class Deck {

    // Singleton instance
    private static Deck instance;

    private final List<Card> deck;

    // Private constructor (Singleton)
    private Deck() {
        deck = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Value value : Card.Value.values()) {
                deck.add(new Card(value, suit)); // Factory-like creation
            }
        }
        shuffle();
    }

    // Public method to get the singleton instance
    public static Deck getInstance() {
        if (instance == null) {
            instance = new Deck();
        }
        return instance;
    }

    public void shuffle() {
        if (!deck.isEmpty()) {
            Collections.shuffle(deck);
        }
    }

    public Card drawCard() {
        if (!deck.isEmpty()) {
            return deck.remove(0);
        }
        return null;
    }

    public int remainingCards() {
        return deck.size();
    }
}
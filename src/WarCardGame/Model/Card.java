/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WarCardGame.Model;

/**
 *
 * @author bhara
 * * The Card class represents a playing card with a value and suit.
 *
 * Design Patterns:
 * - None directly, but used as part of Factory pattern inside Deck.
 *
 * SOLID Principles:
 * - SRP: Only represents a single card's data.
 * - OCP: Easy to add features like "color" without changing existing code.
 * - DRY: No redundancy.
 * - Encapsulation: Uses private variables with getters/setters.
 */
public class Card {

    // Enum representing suit of the card
    public enum Suit {
        HEARTS, CLUBS, SPADES, DIAMONDS
    }

    // Enum representing value of the card
    public enum Value {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
        NINE, TEN, JACK, QUEEN, KING, ACE
    }

    private Value value;
    private Suit suit;

    /**
     * Constructs a card with the given value and suit.
     * @param value The face value of the card.
     * @param suit The suit of the card.
     */
    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    // Getter for value
    public Value getValue() {
        return value;
    }

    // Setter for value
    public void setValue(Value value) {
        this.value = value;
    }

    // Getter for suit
    public Suit getSuit() {
        return suit;
    }

    // Setter for suit
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * String representation of the card.
     */
    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WarCardGame;

/**
 *
 * @author bhara
 */
public class Card {

    // Using Enum for Suit (Aggregation Relationship: Each Card has a Suit)
    public enum Suit {
        HEARTS, CLUBS, SPADES, DIAMONDS;
    }

    // Using Enum for Value (Ranking for Game Logic)
    public enum Value {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    private Value value; // Card Value (Encapsulation)
    private Suit suit;   // Card Suit (Encapsulation)

    /**
     * Constructor for creating a Card object.
     * @param value - Card value (enum)
     * @param suit - Card suit (enum)
     */
    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    // Getters and Setters (Encapsulation)
    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WarCardGame;

/**
 *
 * @author bhara
 * * Utility class for generating a random hand of cards.
 *
 * Design Patterns
 * - Factory: This class generates Card objects and returns them in bulk.
 *
 * SOLID Principles:
 * - SRP: This class only generates card hands.
 * - OCP: Can be extended to generate unique hands or specific types.
 * - DRY: No repetition in logic.
 */

import WarCardGame.Model.Card;
import java.util.Random;

public class CardHandGenerator {

    /**
     * Generates an array of randomly selected cards.
     * Cards may be duplicated because there's no check for uniqueness.
     * 
     * @param numCards Number of cards to generate
     * @return Array of randomly generated Card objects
     */
    public static Card[] generateHand(int numCards) {
        Card[] hand = new Card[numCards];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            int numValues = Card.Value.values().length;
            Card.Value value = Card.Value.values()[random.nextInt(numValues)];

            int numSuits = Card.Suit.values().length;
            Card.Suit suit = Card.Suit.values()[random.nextInt(numSuits)];

            // Factory Pattern: Creating new Card objects
            Card card = new Card(value, suit);
            hand[i] = card;
        }

        return hand;
    }
}
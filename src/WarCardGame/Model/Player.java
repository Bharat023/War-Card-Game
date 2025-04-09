/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WarCardGame.Model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author bhara
 * * The Player class represents a player in the War card game.
 *
 * Design Patterns:
 * - None specifically, but acts as part of MVC's Model layer.
 *
 * SOLID Principles:
 * - SRP: Responsible only for storing and updating player data.
 * - LSP: Can be extended in future without breaking behavior.
 * - DRY: No repeated logic.
 */
public class Player {

    private final String name;
    private int score;
    private final List<Card> hand;

    /**
     * Constructor to initialize a player with a name.
     * @param name Name of the player.
     */
    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.hand = new ArrayList<>();
    }

    /**
     * Draws a card from the deck and adds it to player's hand.
     * This method depends on the abstraction Deck interface (if implemented).
     * 
     * DIP (potential): Could depend on an interface instead of a concrete class.
     * @param deck Deck to draw from.
     * @return Card drawn.
     */
    public Card draw(Deck deck) {
        Card drawnCard = deck.drawCard();
        if (drawnCard != null) {
            hand.add(drawnCard);
        }
        return drawnCard;
    }

    /**
     * Adds 1 point to the player's score.
     */
    public void addScore() {
        score++;
    }

    /**
     * Gets the player's current score.
     * @return score
     */
    public int getScore() {
        return score;
    }

    /**
     * Gets the player's name.
     * @return name
     */
    public String getName() {
        return name;
    }
}

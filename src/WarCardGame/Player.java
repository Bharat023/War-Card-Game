/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WarCardGame;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author bhara
 */
public class Player {
    
    private final String name; 
    private int score; 
    private final List<Card> hand;

    /**
     * Constructor to initialize a player.
     * @param name
     */
    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.hand = new ArrayList<>();
    }

    /**
     * Draws a card from the deck.
     * @param deck
     * @return 
     */
    public Card draw(Deck deck) {
        Card drawnCard = deck.drawCard();
        if (drawnCard != null) {
            hand.add(drawnCard);
        }
        return drawnCard;
    }

    /**
     * Increases the player's score.
     */
    public void addScore() {
        score++;
    }

    /**
     * Gets the player's score.
     * @return 
     */
    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}

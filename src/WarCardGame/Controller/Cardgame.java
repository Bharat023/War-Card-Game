/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package WarCardGame.Controller;


import WarCardGame.Model.Card;
import WarCardGame.Model.Deck;
import WarCardGame.Model.Player;
import java.util.Scanner;

/**
 *
 * @author bhara
 * * The main controller class to run the War card game.
 *
 * Design Patterns:
 * - MVC: This class serves as the Controller.
 * - Singleton: Uses the Singleton Deck instance.
 *
 * SOLID Principles:
 * - SRP: Responsible only for game flow logic.
 * - OCP: Can add new rules or rounds without changing structure.
 * - DIP: Uses Player and Deck through abstraction.
 */
public class Cardgame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Using Singleton pattern to ensure one deck
        Deck deck = Deck.getInstance(); 
        
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        System.out.println("Starting War Card Game...");

        // Game loop for 4 rounds
        for (int round = 1; round <= 4; round++) {
            System.out.println("\nRound " + round);

            // Each player draws a card from the deck
            Card card1 = player1.draw(deck);
            Card card2 = player2.draw(deck);

            // Output drawn cards
            System.out.println(player1.getName() + " drew: " + card1);
            System.out.println(player2.getName() + " drew: " + card2);

            // Compare values using ordinal (enum ordering)
            if (card1.getValue().ordinal() > card2.getValue().ordinal()) {
                player1.addScore();
                System.out.println(player1.getName() + " wins this round!");
            } else if (card1.getValue().ordinal() < card2.getValue().ordinal()) {
                player2.addScore();
                System.out.println(player2.getName() + " wins this round!");
            } else {
                System.out.println("This round is a tie!");
            }

            // Display scores
            System.out.println("Scores -> " + player1.getName() + ": " + player1.getScore() +
                               " | " + player2.getName() + ": " + player2.getScore());
        }

        // Final result
        System.out.println("\nGame Over!");
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins the game with " + player1.getScore() + " points!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " wins the game with " + player2.getScore() + " points!");
        } else {
            System.out.println("The game is a tie!");
        }

        input.close();
    }
}
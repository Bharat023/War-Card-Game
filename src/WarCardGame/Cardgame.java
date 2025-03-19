/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package WarCardGame;


import java.util.Scanner;

/**
 *
 * @author bhara
 */
public class Cardgame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck(); // Create a shuffled deck
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        System.out.println("Starting War Card Game...");
        
        // Play exactly 4 rounds
        for (int round = 1; round <= 4; round++) {
            System.out.println("\nRound " + round);

            // Each player draws a card from the deck
            Card card1 = player1.draw(deck);
            Card card2 = player2.draw(deck);

            // Display drawn cards
            System.out.println(player1.getName() + " drew: " + card1);
            System.out.println(player2.getName() + " drew: " + card2);

            // Compare card values
            if (card1.getValue().ordinal() > card2.getValue().ordinal()) {
                player1.addScore();
                System.out.println(player1.getName() + " wins this round!");
            } else if (card1.getValue().ordinal() < card2.getValue().ordinal()) {
                player2.addScore();
                System.out.println(player2.getName() + " wins this round!");
            } else {
                System.out.println("This round is a tie!");
            }

            // Display updated scores
            System.out.println("Scores -> " + player1.getName() + ": " + player1.getScore() +
                    " | " + player2.getName() + ": " + player2.getScore());
        }

        // Determine the overall winner
        System.out.println("\nGame Over!");
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins the game with " + player1.getScore() + " points!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " wins the game with " + player2.getScore() + " points!");
        } else {
            System.out.println("The game is a tie!");
        }

        input.close(); // Close Scanner
    }
}

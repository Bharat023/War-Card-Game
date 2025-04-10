/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package WarCardGame.Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bhara
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

        
    /**
     * Test of addScore method, of class Player.
     */
    @Test
    public void testAddScore() {
        System.out.println("Running testAddScore...");

        Player instance = new Player("TestPlayer");

        // Initial score should be 0
        int expectedScore = 0;
        int actualScore = instance.getScore();
        assertEquals("Initial score should be 0", expectedScore, actualScore);
        System.out.println("Initial score: " + actualScore);

        // Add points
        instance.addScore();
        instance.addScore(); // Total = 2

        expectedScore = 2;
        actualScore = instance.getScore();
        assertEquals("Score should be 2 after two addScore() calls", expectedScore, actualScore);
        System.out.println("Score after two addScore(): " + actualScore);
    }

    /**
     * Test of getScore method, of class Player.
     */
    @Test
    public void testGetScore() {
        System.out.println("Running testGetScore...");

        Player instance = new Player("SamplePlayer");

        int expectedScore = 0;
        int actualScore = instance.getScore();
        assertEquals("getScore() should return 0 for new player", expectedScore, actualScore);
        System.out.println("Score from getScore(): " + actualScore);
    }

    }


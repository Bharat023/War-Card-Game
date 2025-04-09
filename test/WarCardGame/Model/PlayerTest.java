/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package WarCardGame.Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(expectedScore, actualScore, "Initial score should be 0");
        System.out.println("Initial score: " + actualScore);

        // Add points
        instance.addScore();
        instance.addScore();  // total = 2

        expectedScore = 2;
        actualScore = instance.getScore();
        assertEquals(expectedScore, actualScore, "Score should be 2 after two addScore() calls");
        System.out.println("Score after two addScore(): " + actualScore);
    }
    }


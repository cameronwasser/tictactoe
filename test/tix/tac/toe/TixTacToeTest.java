/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tix.tac.toe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camer
 */
public class TixTacToeTest {
    
    public TixTacToeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createBoard method, of class TixTacToe.
     */
    @Test
    public void testCreateBoard() {
        System.out.println("createBoard");
        TixTacToe instance = new TixTacToe();
        instance.createBoard();
       
        char[] row0 = {' ', ' ', ' '};
        char[] row1 = {' ', ' ', ' '}; 
        char[] row2 = {' ', ' ', ' '}; 
        assertArrayEquals(row0, instance.board[0]);
        assertArrayEquals(row1, instance.board[1]);
        assertArrayEquals(row2, instance.board[2]);
    }

    /**
     * Test of currentPlayer method, of class TixTacToe.
     */
    @Test
    public void testCurrentPlayer() {
        System.out.println("currentPlayer");
        TixTacToe instance = new TixTacToe();
        instance.currentPlayer();
        assertEquals('O', instance.currentPlayer);
        
    }

    /**
     * Test of changePlayer method, of class TixTacToe.
     */
    @Test
    public void testChangePlayer() {
        System.out.println("changePlayer");
        TixTacToe instance = new TixTacToe();
        instance.changePlayer();
        assertEquals('X', instance.changePlayer());
        assertEquals('O', instance.changePlayer());
    }

    /**
     * Test of makeMove method, of class TixTacToe.
     */
    @Test
    public void testMakeMove() {
        System.out.println("makeMove");
        int row = 0;
        int col = 0;
        TixTacToe instance = new TixTacToe();
        instance.createBoard();
        instance.makeMove(row, col);
        assertEquals(instance.board[row][col], instance.currentPlayer);
        instance.changePlayer();
        instance.makeMove(row, col);
        assertEquals(instance.board[row][col], instance.currentPlayer);
    }

    /**
     * Test of spaceInUse method, of class TixTacToe.
     */
    @Test
    public void testSpaceInUse() {
        System.out.println("spaceInUse");
        int row = 0;
        int col = 0;
        TixTacToe instance = new TixTacToe();
        instance.createBoard();
        instance.board[row][col] = 'X';
        boolean expResult = true;
        boolean result = instance.spaceInUse(row, col);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class TixTacToe.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TixTacToe.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tix.tac.toe;

/**
 *
 * @author camer
 */
public class TixTacToe {

    char[][] board;
    char currentPlayer;
    
    
    public void createBoard()
    {
        board = new char[3][3];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            { 
                board[i][j] = ' ';  
            }
        } 
    }
    
    public char currentPlayer()
    {
        currentPlayer = 'O';
        
        return currentPlayer;
    }
    
    
    public char changePlayer()
    {
        if(currentPlayer == 'O')
        {
            currentPlayer = 'X';
        }
        else
        {
            currentPlayer = 'O';
        }
        return currentPlayer;
    }
    
    public void makeMove(int row, int col)
    {
        for(row = 0; row < 3; row++)
        {
            for(col = 0; col < 3; col++)
            { 
                board[row][col] = currentPlayer;  
            }
        } 
    }
    
    public boolean spaceInUse(int row, int col)
    {
        for(row = 0; row < 3; row++)
        {
            for(col = 0; col < 3; col++)
            {
                if(board[row][col] == 'X' || board[row][col] == 'O')
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

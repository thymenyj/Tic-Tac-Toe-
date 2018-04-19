package com.example.thymen.tictactoe;

import com.example.thymen.tictactoe.Tile;


public class Game {
    final private int BOARD_SIZE = 3;
    private Tile[][] board;
    public Boolean playerOneTurn;  // true if player 1's turn, false if player 2's turn
    public int movesPlayed;
    public Boolean gameOver;

    public Game() {
        board = new Tile[BOARD_SIZE][BOARD_SIZE];
        for(int i=0; i<BOARD_SIZE; i++)
            for(int j=0; j<BOARD_SIZE; j++)
                board[i][j] = Tile.BLANK;

        playerOneTurn = true;
        gameOver = false;
    }

    public Tile draw(int row, int column) {
        if (board[row][column] != Tile.BLANK) {
            return Tile.INVALID;
        }
        else {
            if (playerOneTurn == true) {
                board[row][column] = Tile.CROSS;
                playerOneTurn = false;
                return Tile.CROSS;
            }
            else {
                board[row][column] = Tile.CIRCLE;
                playerOneTurn = true;
                return Tile.CIRCLE;
            }
        }


    }

//    public Tile win(int row1, int column1, int row2, int column2, int row2, int column2) {
//        if (board[row1][column1] == Tile.CROSS && )
//    }
}

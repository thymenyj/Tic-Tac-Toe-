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

    public GameState win() {
        // check horizontaal win
        if (board[0][0] == Tile.CROSS && board[0][1] == Tile.CROSS && board[0][2] == Tile.CROSS ) {
            return GameState.PLAYER_ONE;
        }
        else if (board[1][0] == Tile.CROSS && board[1][1] == Tile.CROSS && board[1][2] == Tile.CROSS ) {
            return GameState.PLAYER_ONE;
        }
        else if (board[2][0] == Tile.CROSS && board[2][1] == Tile.CROSS && board[2][2] == Tile.CROSS ) {
            return GameState.PLAYER_ONE;
        }
        // check verticaal win
        else if (board[0][0] == Tile.CROSS && board[1][0] == Tile.CROSS && board[2][0] == Tile.CROSS ) {
            return GameState.PLAYER_ONE;
        }
        else if (board[0][1] == Tile.CROSS && board[1][1] == Tile.CROSS && board[2][1] == Tile.CROSS ) {
            return GameState.PLAYER_ONE;
        }
        else if (board[0][2] == Tile.CROSS && board[1][2] == Tile.CROSS && board[2][2] == Tile.CROSS ) {
            return GameState.PLAYER_ONE;
        }
        // check diagonaal win
        else if (board[0][0] == Tile.CROSS && board[1][1] == Tile.CROSS && board[2][2] == Tile.CROSS ) {
            return GameState.PLAYER_ONE;
        }
        else if (board[0][2] == Tile.CROSS && board[1][1] == Tile.CROSS && board[2][0] == Tile.CROSS ) {
            return GameState.PLAYER_ONE;
        }

        // same for player 2
        else if (board[0][0] == Tile.CIRCLE && board[0][1] == Tile.CIRCLE && board[0][2] == Tile.CIRCLE) {
            return GameState.PLAYER_TWO;
        }
        else if (board[1][0] == Tile.CIRCLE && board[1][1] == Tile.CIRCLE && board[1][2] == Tile.CIRCLE) {
            return GameState.PLAYER_TWO;
        }
        else if (board[2][0] == Tile.CIRCLE && board[2][1] == Tile.CIRCLE && board[2][2] == Tile.CIRCLE) {
            return GameState.PLAYER_TWO;
        }
        // check verticaal win
        else if (board[0][0] == Tile.CIRCLE && board[1][0] == Tile.CIRCLE && board[2][0] == Tile.CIRCLE) {
            return GameState.PLAYER_TWO;
        }
        else if (board[0][1] == Tile.CIRCLE && board[1][1] == Tile.CIRCLE && board[2][1] == Tile.CIRCLE) {
            return GameState.PLAYER_TWO;
        }
        else if (board[0][2] == Tile.CIRCLE && board[1][2] == Tile.CIRCLE && board[2][2] == Tile.CIRCLE) {
            return GameState.PLAYER_TWO;
        }
        // check diagonaal win
        else if (board[0][0] == Tile.CIRCLE && board[1][1] == Tile.CIRCLE && board[2][2] == Tile.CIRCLE) {
            return GameState.PLAYER_TWO;
        }
        else if (board[0][2] == Tile.CIRCLE && board[1][1] == Tile.CIRCLE && board[2][0] == Tile.CIRCLE) {
            return GameState.PLAYER_TWO;
        }
        else {
            return GameState.IN_PROGRESS;
        }
    }
}

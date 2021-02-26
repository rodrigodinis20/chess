package org.academiaDeCodigo.cachealots;

import java.util.ArrayList;

public class Game {
    public static Board board;
    public static ChessPiece chessPiece;

    public Game() {
        board = new Board(8,8);
    }

    public void start(){
        board.draw();
    }
}

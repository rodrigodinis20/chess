package org.academiaDeCodigo.cachealots;

public abstract class ChessPiece {
    private ChessPieceType chessPieceType;
    private boolean onBoard = true;
    private int cols;
    private int rows;
    private String id;
    public ChessPiece(int cols, int rows, String id){
        this.id = id;
        this.cols = cols;
        this.rows = rows;
    }
    public void Move(int cols,int rows,int x,int y){

    }
    public void CheckMove(){

    }
}

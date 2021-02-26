package org.academiaDeCodigo.cachealots;

public class Pawn extends ChessPiece {
    public int movementcounter=0;
    public Pawn(int cols, int rows, String id) {
        super(cols, rows, id);
    }
    public void Movement(int col,int row,int x,int y){
        //public
        if(y == row+2 && col == x) {
            if (movementcounter == 0) {

            }
        }
        if(col == x && y == row+1){

        }
        System.out.println("you can't move like that");
    }
}

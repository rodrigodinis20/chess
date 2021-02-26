package org.academiaDeCodigo.cachealots;

import java.util.ArrayList;

public class Board {
    private ArrayList<ChessPiece> whitePieces;
    private ArrayList<ChessPiece> blackPieces;

    private Field[][] fields;
    public Board(int cols, int rows) {
        fields = new Field[cols][rows];
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields.length; j++) {
                fields[i][j] = new Field(i, j , this);
            }
        }

        whitePieces = new ArrayList<>();
        whitePieces.add(new King(4,0,"wk"));
        whitePieces.add(new Queen(3,0,"wq"));
        whitePieces.add(new Rook(0,0,"wr1"));
        whitePieces.add(new Rook(7,0,"wr2"));
        whitePieces.add(new Knight(1,0,"wn1"));
        whitePieces.add(new Knight(6,0,"wn2"));
        whitePieces.add(new Bishop(2,0,"wb1"));
        whitePieces.add(new Bishop(5,0,"wb2"));
        whitePieces.add(new Pawn(0,1,"wp1"));
        whitePieces.add(new Pawn(1,1,"wp2"));
        whitePieces.add(new Pawn(2,1,"wp3"));
        whitePieces.add(new Pawn(3,1,"wp4"));
        whitePieces.add(new Pawn(4,1,"wp5"));
        whitePieces.add(new Pawn(5,1,"wp6"));
        whitePieces.add(new Pawn(6,1,"wp7"));
        whitePieces.add(new Pawn(7,1,"wp8"));
        blackPieces = new ArrayList<>();
        blackPieces.add(new King(4,7,"bk"));
        blackPieces.add(new Queen(4,7,"bq"));
        blackPieces.add(new Rook(0,7,"br1"));
        blackPieces.add(new Rook(7,7,"br2"));
        blackPieces.add(new Knight(1,7,"bn1"));
        blackPieces.add(new Knight(6,7,"bn2"));
        blackPieces.add(new Bishop(2,7,"bb1"));
        blackPieces.add(new Bishop(5,7,"bb2"));
        blackPieces.add(new Pawn(0,6,"bp1"));
        blackPieces.add(new Pawn(1,6,"bp2"));
        blackPieces.add(new Pawn(2,6,"bp3"));
        blackPieces.add(new Pawn(3,6,"bp4"));
        blackPieces.add(new Pawn(4,6,"vp5"));
        blackPieces.add(new Pawn(5,6,"bp6"));
        blackPieces.add(new Pawn(6,6,"bp7"));
        blackPieces.add(new Pawn(7,6,"bp8"));
    }
    public void draw(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("|   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |    |    |\n");
        stringBuilder.append("| 0 | ♖ | ♘ | ♗ | ♕ | ♔ | ♗ | ♘ | ♖ | 0 |\n");
        stringBuilder.append("| 1 | ☺  | ☺ | ☺  |  ☺ | ☺ |  ☺ | ☺  | ☺ | 1 |\n");
        stringBuilder.append("| 2 |    |   |    |   |    |    |    |   | 2 |\n");
        stringBuilder.append("| 3 |    |   |    |   |    |    |    |   | 3 |\n");
        stringBuilder.append("| 4 |    |   |    |   |    |    |    |   | 4 |\n");
        stringBuilder.append("| 5 |    |   |    |   |    |    |    |   | 5 |\n");
        stringBuilder.append("| 6 | ☻  | ☻ | ☻  | ☻ | ☻  |  ☻ | ☻  | ☻ | 6 |\n");
        stringBuilder.append("| 7 | ♜ | ♞ | ♝ | ♛ | ♚ | ♝ | ♞ | ♜ | 7 |\n");
        stringBuilder.append("|   | 0  | 1 | 2  |  3 | 4 |  5 | 6  | 7 |    |\n");
        System.out.println(stringBuilder);
    }
}

package org.academiaDeCodigo.cachealots;

public class Field {
        private Board board;
        private int col;
        private int row;
        public Field(int col, int row, Board board) {
            this.col = col;
            this.row = row;
            this.board = board;
        }
}

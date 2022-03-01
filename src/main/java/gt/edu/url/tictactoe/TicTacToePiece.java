package gt.edu.url.tictactoe;

import gt.edu.url.adapter.Piece;

public enum TicTacToePiece implements Piece {

    X, O, E;

    @Override
    public String toString() {
        switch (this) {
            case X:
                return "X";
            case O:
                return "O";
            default:
                return " ";
        }
    }

    @Override
    public TicTacToePiece opposite() {
        switch (this) {
            case X:
                return O;
            case O:
                return X;
            default:
                return E;
        }
    }
}

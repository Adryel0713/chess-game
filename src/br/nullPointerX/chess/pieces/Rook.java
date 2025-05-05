package br.nullPointerX.chess.pieces;

import br.nullPointerX.boardGame.Board;
import br.nullPointerX.chess.ChessPiece;
import br.nullPointerX.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}

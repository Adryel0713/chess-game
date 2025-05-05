package br.nullPointerX;

import br.nullPointerX.boardGame.Board;
import br.nullPointerX.boardGame.Position;
import br.nullPointerX.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}

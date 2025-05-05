package br.nullPointerX;

import br.nullPointerX.boardGame.Board;
import br.nullPointerX.boardGame.Position;
import br.nullPointerX.chess.ChessMatch;
import br.nullPointerX.chess.ChessPiece;
import br.nullPointerX.chess.ChessPosition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source,target);
        }

    }
}

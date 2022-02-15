package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
		UI.printBoard(chessMatch.getPieces());
		System.out.print("\nSource: ");
		ChessPosition source = UI.redChessPosition(sc);
		
		System.out.print("\nTarget: ");
		ChessPosition target = UI.redChessPosition(sc);
		
		ChessPiece capturedPiece = chessMatch.peformChessMove(source, target);
		}
	}
}

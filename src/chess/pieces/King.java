package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
	private ChessMatch chessMatch;

	public King() {
		super();
	}

	public King(Position position, Board board, Color color, int moveCount, ChessMatch chessMatch) {
		super(position, board, color, moveCount);
		this.chessMatch = chessMatch;
	}

	public ChessMatch getChessMatch() {
		return chessMatch;
	}

	public void setChessMatch(ChessMatch chessMatch) {
		this.chessMatch = chessMatch;
	}
}

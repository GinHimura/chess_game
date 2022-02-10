package chess;

import java.util.Iterator;

import boardgame.Board;

public class ChessMatch {
	//private int turn;
	//private Color currentPlayer;
	//private boolean check;
	//private boolean checkMate;
	//private ChessPiece enPassantVulnerable;
	//private ChessPiece promoted;
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}

	/*public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public Color getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Color currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public boolean isCheckMate() {
		return checkMate;
	}

	public void setCheckMate(boolean checkMate) {
		this.checkMate = checkMate;
	}

	public ChessPiece getEnPassantVulnerable() {
		return enPassantVulnerable;
	}

	public void setEnPassantVulnerable(ChessPiece enPassantVulnerable) {
		this.enPassantVulnerable = enPassantVulnerable;
	}

	public ChessPiece getPromoted() {
		return promoted;
	}

	public void setPromoted(ChessPiece promoted) {
		this.promoted = promoted;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}*/
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	/*public boolean[][] possileMoves(ChessPosition sourcePosition){
		return null;
	}
	
	public ChessPosition peformChessMove(ChessPosition sourcePosition, ChessPosition targePosition) {
		return targePosition;
	}
	
	public ChessPiece replacePromotedPiece(String type) {
		return enPassantVulnerable;
	}*/
}

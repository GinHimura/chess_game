package boardgame;

public abstract class Piece {
	protected Position position;
	protected Board board;

	public Piece() {
	}

	public Piece(Position position, Board board) {
		this.position = position;
		this.board = board;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public abstract boolean [][] posibleMoves();
	
	public boolean possibleMove(Position position) {
		return false;
	}
	
	public boolean isThereAnyPossibleMove() {
		return false;	
	}
}

package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // não precisaria colocar, pois o java automaticamente ja coloca o valor nulo.	
	}

	protected Board getBoard() {
		return board;
	}
		
}

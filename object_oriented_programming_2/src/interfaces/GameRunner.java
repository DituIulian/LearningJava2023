package interfaces;

public class GameRunner {

	public static void main(String[] args) {
		MarioGame game = new MarioGame();
		game.up();
		game.down();
		game.left();
		game.right();

		ChessGame gameofChess = new ChessGame();
		gameofChess.up();
		gameofChess.down();
		gameofChess.left();
		gameofChess.right();
	}

}

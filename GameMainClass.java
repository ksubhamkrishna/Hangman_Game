package hangmangame;

public class GameMainClass {

	public static void main(String[] args) {
		HangmanGame game = new HangmanGame();
		game.run();
		game.close(); // Calling the close method to call and close the Scanner Class Object.
	}

}

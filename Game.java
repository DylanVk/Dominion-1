
public class Game {
	private Player[] players;

	public Game(int numberOfPlayers) {
		players = new Player[numberOfPlayers];
		for (int i = 0; i < numberOfPlayers; i++) {
			players[i] = new Player();
		}
	}

}

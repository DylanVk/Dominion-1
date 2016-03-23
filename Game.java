import java.util.ArrayList;

public class Game {
	private Player[] players;
	//public ArrayList<Card> trashPile;
	
	//public void setTrashPile(){
		//ArrayList<Card> pile = players[?].getTrashPlayer();

	//}
	public Game(int numberOfPlayers) {
		players = new Player[numberOfPlayers];
		for (int i = 0; i < numberOfPlayers; i++) {
			players[i] = new Player();
		}
	}

}

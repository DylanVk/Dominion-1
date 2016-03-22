
public class Game {
	private Deck[] players;
	
	public Game() {
		players[0] = new Deck();
		players[1] = new Deck();
		startGame();
	}
	
	public Game(int numberOfPlayers) {
		for(int i=0; i<numberOfPlayers; i++){
			players[i] = new Deck();
		}
		startGame();
	}
	
	public void startGame(){
		//players[0].addCard("copper");
		//players[0].addCard("copper");
		
	}
	
}

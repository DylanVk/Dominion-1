
public class Game {
	private Deck[] players;
	
	public Game() {
		players = new Deck[2];
		players[0] = new Deck();
		players[1] = new Deck();
		startGame();
	}
	
	public Game(int numberOfPlayers) {
		players = new Deck[numberOfPlayers];
		for(int i=0; i<numberOfPlayers; i++){
			players[i] = new Deck();
		}
		startGame();
	}
	
	public void startGame(){
		//add starting decks to their respective players
		for(int i=0;i<players.length;i++){
			for(int j=0; j<7; j++){
				players[i].addCard("copper");
			}
			for(int k=0; k<7; k++){
				players[i].addCard("estate");
			}
		}
		
	}
	
}

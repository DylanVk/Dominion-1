import java.util.ArrayList;

public class Player {
	private Deck currentDeck;
	private Turn thisTurn;

	public Player() {
		currentDeck = new Deck();
		initDeck();
	}

	public void initDeck() {
		// add starting decks to their respective players
		for (int j = 0; j < 7; j++) {
			currentDeck.addCard("copper");
		}
		for (int k = 0; k < 3; k++) {
			currentDeck.addCard("estate");
		}
	}
	
	//public ArrayList<Card> getTrashPlayer(){
		
		//return thisTurn.getTrashThisTurn();
	//}

	public void startTurn() {
		thisTurn = new Turn(currentDeck);
	}

	public void endTurn() {
		thisTurn.discardHand();
		thisTurn.drawCard(5);
	}
}

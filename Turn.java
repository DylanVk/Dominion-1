import java.util.ArrayList;
import java.util.Collections;

public class Turn {
	private Deck currentDeck;
	private ArrayList<Card> drawPile;
	private ArrayList<Card> currentHand;
	private ArrayList<Card> discardPile;
	//private ArrayList<Card> trashAddedThisTurn;

	public Turn(Deck currentDeck) {
		this.currentDeck = currentDeck;
		this.drawPile = currentDeck.getCardsOnDrawPile();
		this.currentHand = currentDeck.getCardsInHand();
		this.discardPile = currentDeck.getCardsOnDiscardPile();
	}

	private void pickDiscards(int numberOfCards) {

	}

	//public ArrayList<Card> getTrashThisTurn() {

		//return trashAddedThisTurn;
	//}

	public void discardHand() {
		for (Card toDiscard : currentHand) {
			discardPile.add(toDiscard);
		}
		currentHand.clear();
	}

	public void drawCard(int numberOfCards) {
		// deckSize - 1 to use with ArrayList indexes
		int topCard = drawPile.size() - 1;
		while (numberOfCards > 0) {
			if (drawPile.isEmpty()) {
				resetDiscardPile();
			}
			topCard = drawPile.size() - 1;
			Card drawnCard = drawPile.get(topCard);
			drawPile.remove(topCard);
			currentHand.add(drawnCard);
			numberOfCards--;
		}
	}

	private void resetDiscardPile() {
		drawPile = discardPile;
		discardPile.clear();
		shufflePile();
	}

	public void shufflePile() {
		Collections.shuffle(drawPile);
	}

}

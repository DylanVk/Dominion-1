import java.util.ArrayList;

public class Deck {
	private ArrayList currentDeck;
	
	public Deck(){
		currentDeck = new ArrayList();
	}
	
	public void addCard(Card newCard) {
		currentDeck.add(newCard);
	}
	
	public Card drawCard(){
		Card placeholder = new Card();
		return placeholder;
	}
	

}

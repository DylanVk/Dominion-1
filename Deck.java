import java.util.ArrayList;
import java.util.Collections;


public class Deck {
	private ArrayList<Card> currentDeck;
	private ArrayList<Card> currentHand;
	private ArrayList<Card> allCards;
	
	public Deck(){
		currentDeck = new ArrayList();
		currentHand = new ArrayList();
		drawCard(5);
		allCards = new ArrayList();
		initTestCards();
	}
	
	public void addCard(String cardName){
		//currentDeck.add(cardName);findArrayPosition(cardName);
		int pos = findArrayPosition(cardName);
		currentDeck.add(allCards.get(pos));
		int itemPosistion = findArrayPosition(cardName);
		currentDeck.add(allCards.get(itemPosistion));
	}
	
	public void drawCard(int numberOfCards){
		for(int i=currentDeck.size(); i<numberOfCards; i--){
			Card drawnCard = currentDeck.get(i);
			currentHand.add(drawnCard);
		}
	}
	
	private void shuffleDeck(){
		Collections.shuffle(currentDeck);
	}
	
	public int findArrayPosition(String cardName){ // TODO check if card exists
		int counter = 0;
		for (Card value : allCards) {
			if(value.getName() == cardName){
				return counter;				
			}
			counter++;		
		}
		return -1;
	}
	
	public void initTestCards(){
		//Card name = new Card(id, name, description, cost);
		Card cellar = new Card(1,"cellar",1,"Discard any number of cards. +1 Card per card discarded.",2);
		Card market = new Card(2,"market",1,"",5);
		Card militia = new Card(3,"militia",1,"Each other player discards down to 3 cards in his hand.",4);
		Card mine = new Card(4,"mine",1,"Trash a Treasure card from your hand. Gain a Treasure card costing up to 3 Coins more, put it into your hand.",5);
		Card moat = new Card(5,"moat",1,"[Action]: Draw 2 Cards. [Reaction]: When another player plays an Attack card, you may reveal this from your hand. If you do, you are unaffected by that attack.",2);
		Card remodel = new Card(6,"remodel",1,"Trash a card from your hand. Gain a card costing up to 2 Coins more than the trashed card.",4);
		Card smithy = new Card(7,"smithy",1,"",4);
		Card village = new Card(8,"village",1,"",3);
		Card woodcutter = new Card(9,"woodcutter",1,"",3);
		Card workshop = new Card(10,"workshop",1,"Gain a card costing up to 4 Coins.",3);	
		allCards.add(cellar);
		allCards.add(market);
		allCards.add(militia);
		allCards.add(mine);
		allCards.add(moat);
		allCards.add(remodel);
		allCards.add(smithy);
		allCards.add(village);
		allCards.add(woodcutter);
		allCards.add(workshop);
		
		
	}
}

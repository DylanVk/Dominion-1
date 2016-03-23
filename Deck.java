import java.util.ArrayList;
import java.util.Collections;
// getNumberOf(String typeOfCard)

public class Deck {
	private ArrayList<Card> currentDeck;
	private ArrayList<Card> currentHand;
	private ArrayList<Card> discardPile;
	private ArrayList<Card> allCards;
	
	private int victoryPoints;
	private int coinsInHand;
	
	public Deck(){
		currentDeck = new ArrayList<Card>();
		currentHand = new ArrayList<Card>();
		allCards = new ArrayList<Card>();
		initTestCards();
	}	
	
	private void setCoinsInHand(){
		int coinCounter = 0;
		for (Card card : currentHand) {
			if(card.getType() == 0){
				coinCounter+=card.getValue();
			}
		}
		this.coinsInHand = coinCounter;
	}
	
	private void setVictoryPoints(){
		int victoryCounter = 0;
		for (Card card : currentDeck) {
			if(card.getType() == 1){
				victoryCounter+=card.getValue();
			}
		}
		for (Card card : currentHand) {
			if(card.getType() == 1){
				victoryCounter+=card.getValue();
			}
		}
		
		this.victoryPoints = victoryCounter;
	}
	
	public int getVictoryPoints(){
		setVictoryPoints();
		return this.victoryPoints;
	}
	
	public int getCoinsInHand(){
		setCoinsInHand();
		return this.coinsInHand;
	}

	
	public void addCardToDeck(String cardName){
		// TODO check if card was found
		int itemPosistion = findPositionInArray(cardName);
		currentDeck.add(allCards.get(itemPosistion));	
	}
	
	public void drawCard(int numberOfCards){
		//deckSize - 1 to use with ArrayList indexes
		int topCard = currentDeck.size() - 1;
		while(numberOfCards > 0){
			if(currentDeck.isEmpty()){
				resetDiscardPile();
			}
			topCard = currentDeck.size() - 1;
			Card drawnCard = currentDeck.get(topCard);
			currentDeck.remove(topCard);
			currentHand.add(drawnCard);
			numberOfCards--;
		}
	}
	
	private void discardHand(){
		for (Card toDiscard : currentHand) {
			discardPile.add(toDiscard);
		}
		currentHand.clear();
	}
	
	private void pickDiscards(int numberOfCards){
		
	}
	
	private void resetDiscardPile(){
		currentDeck = discardPile;
		discardPile.clear();
		shuffleDeck();
	}
	
	public void shuffleDeck(){
		Collections.shuffle(currentDeck);
	}
	
	private int findPositionInArray(String cardName){
		int counter = 0;
		for (Card value : allCards) {
			if(value.getName() == cardName){
				return counter;				
			}
			counter++;		
		}
		return -1;
	}
	
	private void initTestCards(){
		//type 	--> 0 = Treasure
		//		--> 1 = Victory
		//		--> 2 = Other
		//Card name = new Card(id, name, description, cost, type, value);
		Card cellar = new Card(1,"cellar",1,"Discard any number of cards. +1 Card per card discarded.",2,2,0);
		Card market = new Card(2,"market",1,"",5,2,0);
		Card militia = new Card(3,"militia",1,"Each other player discards down to 3 cards in his hand.",4,2,0);
		Card mine = new Card(4,"mine",1,"Trash a Treasure card from your hand. Gain a Treasure card costing up to 3 Coins more, put it into your hand.",5,2,0);
		Card moat = new Card(5,"moat",1,"[Action]: Draw 2 Cards. [Reaction]: When another player plays an Attack card, you may reveal this from your hand. If you do, you are unaffected by that attack.",2,2,0);
		Card remodel = new Card(6,"remodel",1,"Trash a card from your hand. Gain a card costing up to 2 Coins more than the trashed card.",4,2,0);
		Card smithy = new Card(7,"smithy",1,"",4,2,0);
		Card village = new Card(8,"village",1,"",3,2,0);
		Card woodcutter = new Card(9,"woodcutter",1,"",3,2,0);
		Card workshop = new Card(10,"workshop",1,"Gain a card costing up to 4 Coins.",3,2,0);	
		
		//Treasures Cards
		Card copper = new Card(11,"copper",0,"",0,0,1);
		Card silver = new Card(12,"silver",0,"",3,0,2);
		Card gold = new Card(13,"gold",0,"",6,0,3);
		
		//victory cards
		Card estate = new Card(14,"estate",0,"",2,1,1);
		Card dutchy = new Card(15,"dutchy",0,"",5,1,3);
		Card province = new Card(16,"province",0,"",8,1,6);
		
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
		allCards.add(workshop);
		allCards.add(copper);
		allCards.add(silver);
		allCards.add(gold);
		allCards.add(estate);
		allCards.add(dutchy);
		allCards.add(province);
	}
}

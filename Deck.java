import java.util.ArrayList;
import java.util.Collections;
// getNumberOf(String typeOfCard)

public class Deck {
	private ArrayList<Card> currentDeck;
	private ArrayList<Card> currentHand;
	private ArrayList<Card> allCards;
	
	public Deck(){
		currentDeck = new ArrayList<Card>();
		currentHand = new ArrayList<Card>();
		allCards = new ArrayList<Card>();
		initTestCards();
	}
	
	private int getNumberOf(String typeOfCard){
		return 0;
	}
	
	public void addCardToDeck(String cardName){
		// TODO check if card was found
		int itemPosistion = findPositionInArray(cardName);
		currentDeck.add(allCards.get(itemPosistion));	
	}
	
	public void drawCard(int numberOfCards){
		int deckSize = currentDeck.size() -1;
		int min = deckSize-numberOfCards;
		
		for(int i=deckSize; i>min; i--){
			Card drawnCard = currentDeck.get(i);
			currentDeck.remove(i);
			currentHand.add(drawnCard);
			//System.out.println(drawnCard.getName());
		}
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
		
		//Treasures Cards
		Card copper = new Card(11,"copper",0,"",0);
		Card silver = new Card(12,"silver",0,"",3);
		Card gold = new Card(13,"gold",0,"",6);
		
		//victory cards
		Card estate = new Card(14,"estate",0,"",2);
		Card dutchy = new Card(15,"dutchy",0,"",5);
		Card province = new Card(16,"province",0,"",8);
		
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

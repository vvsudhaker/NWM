package stddeckcardstest;

import java.util.Random;

public class DeckOfCardsShuffleDeal {

	private CardFaceSuits deck[]; //array of card objects
	private int currentCard; //index of next card dealt
	private final int NUMBER_OF_CARDS = 52; //CONSTANt number of cards
	private Random randomNumbers; //rand num genertaor
	
	//constructor fills deck of cards
		public DeckOfCardsShuffleDeal() {
				String faces[]={"Ace","Deuce","Three","Four","Five","Six",
				"Seven","Eight","Nine","Ten","Jack","Queen","King"};
				String suits[]={"Hearts","Diamonds","Clubs","Spades"};
				
				deck = new CardFaceSuits[NUMBER_OF_CARDS]; //create array of card objects
				currentCard =0; //set current card so first card dealt is deck[0]
				randomNumbers = new Random(); //create random num genertaor
				
				//populate deck with card objects
				for (int count =0; count < deck.length; count++)
					deck[count]= new CardFaceSuits(faces[count % 13], suits[count/13]);
				} // end DeckofCards constructor
				//shuffle deck of cards with one-pass algorithm
				
			public void shufflecards() {
				//after shuffling, deal should start at deck[-0] again
				currentCard = 0; //reinitialize current card
				//for each card,pick another random card and swap them
				for(int first =0;first < deck.length;first++) {
					//select  a random number between 0 and 51
					int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
					
					//Swap current card with the rand selected card
					CardFaceSuits temp = deck[first];
					deck[first] = deck[second];
					deck[second] = temp;
				}//end for
			} //end shuffle
			
			//deal one card
			public CardFaceSuits dealCard() {
			//determine whether cards are still to be deal
			if(currentCard < deck.length)
				return deck[currentCard++]; //return current card in array
			else
				return null; //return null to indicate that all cards were dealt
			}//end deal cards

}

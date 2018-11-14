package stddeckcardstest;

public class StandardDeckCardsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeckOfCardsShuffleDeal myDeckofCards = new DeckOfCardsShuffleDeal();
		myDeckofCards.shufflecards(); //placing cards in random order
	
		//print 52 cards in the order in which they are dealt
		for (int i=0; i<13; i++) {
			//deal and print 4 cards
			System.out.printf("%-20s%-20s%-20s%-20s\n",
				myDeckofCards.dealCard(),myDeckofCards.dealCard(),
				myDeckofCards.dealCard(),myDeckofCards.dealCard());
		} //end for
	}

}

package stddeckcardstest;

public class CardFaceSuits {

	private String face; //face of our card
	private String suit; //suit of our card
	
	//two argument constructor initializes card's face and suit
	public CardFaceSuits(String cardFace,String cardSuit) {
		face = cardFace; //initialize face of the card
		suit = cardSuit; //initialize suit of the card
	} //end constructor
	
	//return string representation of Card
	public String toString() {
		return face + " of " + suit;
	} //end method toString
	
}

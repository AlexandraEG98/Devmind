package c7;

import java.util.ArrayList;


public class Deck {

	ArrayList<Card> cards;
	Deck(){
		cards = new ArrayList();
		for(Rank myRank : Rank.values()) {
			for(Suit mySuit : Suit.values()) {
				cards.add(new Card (myRank, mySuit));
			}
		}
		
	}
}

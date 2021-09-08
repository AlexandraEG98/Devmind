package c7;

public class Card{

	   Rank myRank;
	   Suit mySuit;
	   
	   public Card(Rank myRank,Suit mySuit){
		   this.myRank = myRank;
		   this.mySuit = mySuit;
	   }

	   public String toString(){
		   return myRank + " de " + mySuit;
	   }
	   
	  
	}

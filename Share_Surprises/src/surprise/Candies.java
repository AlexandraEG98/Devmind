package surprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise {

	int number;
	static ArrayList<String> candies = new ArrayList<String>(Arrays.asList("chocolate", "jelly", "fruits", "vanilla"));
	String tipCandies;
	static Random random = new Random();
	
	private Candies (int numberCandies, String tipCandies ) {
		this.tipCandies = tipCandies;
		this.number = numberCandies;
	}
	public static Candies generateCandies() {
		
		int numberCandies = random.nextInt(100);
		int indexCandies = random.nextInt(candies.size());
		String tipCandies = candies.get(indexCandies); 
		Candies surpriseCandies = new Candies(numberCandies, tipCandies);
		
		return surpriseCandies;
	}
	@Override
	public void enjoy() {
		System.out.println("Candies! Ai primit " + this.number + " bomboane cu " + this.tipCandies + "! ");
	}
			
	
}

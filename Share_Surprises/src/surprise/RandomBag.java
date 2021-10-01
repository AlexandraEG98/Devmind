package surprise;

import java.util.ArrayList;
import java.util.Random;

public class RandomBag implements IBag{

	private ArrayList <ISurprise> randomBag;
	
	
	static Random random = new Random();
	public RandomBag() {
		randomBag = new ArrayList<ISurprise>();
	}
	public void put(ISurprise newSurprise) {
		randomBag.add(newSurprise);
	}
	 
	 public void put(IBag bagOfSurprises) {
		 ArrayList<ISurprise> addIBag = this.getRandomBag();
		 for(int i = 0; i < addIBag.size(); i++) {
			 this.randomBag.add(addIBag.get(i));
		 }
	 }
	 
	 public ISurprise takeOut() {
		int randomNumber = random.nextInt(getRandomBag().size());
		return getRandomBag().remove(randomNumber);
	}
	  
	 public boolean isEmpty() {
		 return getRandomBag().isEmpty();
	 }
	 
	 public int size() {
		 return getRandomBag().size();
	 }
	 public  ArrayList<ISurprise> getRandomBag() {
		 return randomBag;
	 }
	 
}

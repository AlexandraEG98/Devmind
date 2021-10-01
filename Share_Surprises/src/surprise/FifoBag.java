package surprise;

import java.util.ArrayList;


public class FifoBag implements IBag {
	private ArrayList <ISurprise> fifoBag;
	 int cnt = -1;
	
	
	public FifoBag() {
		fifoBag = new ArrayList<ISurprise>();
	}
	public void put(ISurprise newSurprise) {
		fifoBag.add(newSurprise);
		
	}
	 
	 public void put(IBag bagOfSurprises) {
		 ArrayList<ISurprise> addIBag = this.getFifoBag();
		 for(int i = 0; i < addIBag.size(); i++) {
			 this.fifoBag.add(addIBag.get(i));
		 }
	 }
	 
	 public ISurprise takeOut() {
		cnt++;
		if(cnt == getFifoBag().size()) {
			cnt = 0;
		}
		return getFifoBag().remove(0);
	}
	  
	 public boolean isEmpty() {
		 return getFifoBag().isEmpty();
	 }
	 
	 public int size() {
		 return getFifoBag().size();
	 }
	 public  ArrayList<ISurprise> getFifoBag() {
		 return fifoBag;
	 }
}

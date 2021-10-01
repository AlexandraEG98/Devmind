package surprise;

import java.util.ArrayList;

public class LifoBag implements IBag{
	private ArrayList <ISurprise> lifoBag;
	static int cnt ;
	
	
	public LifoBag() {
		lifoBag = new ArrayList<ISurprise>();
	}
	public void put(ISurprise newSurprise) {
		lifoBag.add(newSurprise);
		cnt = lifoBag.size();
	}
	 
	 public void put(IBag bagOfSurprises) {
		 ArrayList<ISurprise> addIBag = this.getLifoBag();
		 for(int i = 0; i < addIBag.size(); i++) {
			 this.lifoBag.add(addIBag.get(i));
		 }
		 cnt = lifoBag.size();
	 }
	 
	 public ISurprise takeOut() {
		cnt--;
		if(cnt == 0) {
			cnt = lifoBag.size() - 1;
		}
		return getLifoBag().remove(cnt);
	}
	  
	 public boolean isEmpty() {
		 return getLifoBag().isEmpty();
	 }
	 
	 public int size() {
		 return getLifoBag().size();
	 }
	 public  ArrayList<ISurprise> getLifoBag() {
		 return lifoBag;
	 }
}

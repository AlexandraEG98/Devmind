package surprise;

public class BagFactory implements IBagFactory{

	private static BagFactory bag;
	
	private BagFactory() {
		
	}
	
	public IBag makeBag(String name) {
		String namemakeBag = name.toLowerCase();
		
		switch(namemakeBag) {
			case "random" :
				return  new RandomBag();
			case "fifo" :
				return  new FifoBag();
			case "lifo" :
				return  new LifoBag();
			}
		
		return null;
		
	}
	public static BagFactory getInstance() {
		if (bag == null) {
			bag = new BagFactory();
		}
		return bag;
	}
}

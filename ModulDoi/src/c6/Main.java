package c6;

public class Main {

	public static void main(String[] args) {
		MyIntArrayList c = new MyIntArrayList();
		MyIntArrayList d = new MyIntArrayList();
		
		
		c.add(4);
		c.add(5);
		c.add(6);
		c.add(7);
		c.add(8);
		c.add(9);
		
		d.add(10);
		d.add(11);
		d.add(12);
		d.add(13);
		d.add(14);
		
		
		c.addAll(2, d);
		
		for(int i = 0; i < c.size(); i++) {
			System.out.print(c.get(i) + " ");
		}
		
	}

}

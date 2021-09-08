package c5;

import java.util.ArrayList;
import java.util.Collections;

public class Ex2 {

public static void metoda(String prop) {
	
	ArrayList<Character> prop2 = new ArrayList<Character>();
	
	int max = -1;
	
	for(int i = 0; i < prop.length(); i++) {
		if(Character.isWhitespace(prop.charAt(i))) {
			continue;
		}
		
		int counter = 1;
		
		for(int j = i + 1; j < prop.length(); j++) {
			if(prop.charAt(i) == prop.charAt(j)) {
				counter++;
			}
		}
		
		if(counter > max) {
			max = counter;
			prop2.clear();
			prop2.add(prop.charAt(i));
		} else if(counter == max) {
			prop2.add(prop.charAt(i));
		}
	}
	System.out.println("Litera " + prop2 + " apare de " + max + " ori");
}
	public static void main(String[] args) {
		
	String prop = " Ana are mere pere caiseeeee";
	metoda(prop);

	}
}
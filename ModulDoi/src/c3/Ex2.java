package c3;

import java.util.Arrays;

public class Ex2 {
	public static boolean anagramSolver(String anag1, String anag2) {
		String anag1clean = clean(anag1);
		String anag2clean = clean(anag2);
		
		char[] array1 = anag1clean.toCharArray();
		char[] array2 = anag2clean.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
//		System.out.println(array1);
//		System.out.println(array2);	
		
		return Arrays.equals(array1, array2);
		
//		for(int i = 0; i < anag1clean.length(); i++) {
//			for(int j = 0; i < anag2clean.length(); j++) {
//				while(anag1clean.charAt(i) != (anag2clean.charAt(j))) {
//					System.out.println(anag1clean.charAt(i) + "i");
//					System.out.println(anag2clean.charAt(j) + "j");
//					return false;
//				}
//			}
//		}
		
		
	}
	public static String clean(String anag) {
		String anagClean = "";
		for(int i = 0; i < anag.length(); i++) {
			if(Character.isLetter(anag.charAt(i))) {
				anagClean += anag.charAt(i);
			}
		}
		return anagClean;
	}

	public static void main(String[] args) {
		// true
//		String anag1 = "fairy tales!";
//		String anag2 = "rail, safety";
		
		//false
		String anag1 = "silver bullet";
		String anag2 = "sunny day";
 
		String anag1LC = anag1.toLowerCase();
		String anag2LC = anag2.toLowerCase();
		
		System.out.println(anagramSolver(anag1LC, anag2LC));
	}

}

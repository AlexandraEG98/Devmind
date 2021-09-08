package C14;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti marimea matricei: ");
		int matrixDimension = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i < matrixDimension; i++ ) {
			ArrayList<Integer> newRow = new ArrayList<>();
			for(int j = 0; j < matrixDimension; j++) {
				newRow.add(0);
				
			}
		}
	}

}

package C14;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduceti dimensiunea matricei: ");
		int matrixDimension = sc.nextInt();
		int mainDiagValue = sc.nextInt();
		int sndDiagValue = sc.nextInt();
		int centerValue = sc.nextInt();
		int leftValue = sc.nextInt();
		int upValue =  sc.nextInt();
		int rightValue = sc.nextInt();
		int bottomValue = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>(matrixDimension);
		
		for (int i = 0; i < matrixDimension; i++) {
			ArrayList<Integer> newRow = new ArrayList<>(matrixDimension);
			for (int j = 0; j < matrixDimension; j++) {
				newRow.add(0);
				
				if(matrixDimension % 2 != 0) {
					newRow.set(j, centerValue);
				}
				if (i == j) {
		            newRow.set(j,  mainDiagValue);
		        }
				if (i + j == matrixDimension - 1){
		        	newRow.set(j, sndDiagValue);
		        } 
				if (i < j && i +j < matrixDimension - 1){
		        	newRow.set(j, upValue);
		        } 
				if (i < j && i +j > matrixDimension - 1){
		        	newRow.set(j, rightValue);
		        }
				if (i > j && i +j > matrixDimension - 1){
		        	newRow.set(j, bottomValue);
		        }
				if (i > j && i +j < matrixDimension - 1){
		        	newRow.set(j, leftValue);
		        }
				
			}
			matrix.add(newRow);
		}
			matrix.get(matrixDimension / 2).set(matrixDimension / 2, centerValue);
//		
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.get(i).size(); j++) {
				System.out.print(matrix.get(i).get(j) + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}




package C14;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int[][] numbers;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti marimea matricei: ");
		int matrixDimension  = sc.nextInt();
		int mainDiagValue = sc.nextInt();
		int sndDiagValue = sc.nextInt();
		int centerValue = sc.nextInt();
		int leftValue = sc.nextInt();
		int upValue = sc.nextInt();
		int rightValue = sc.nextInt();
		int bottomValue = sc.nextInt();
		
		numbers = new int[matrixDimension][matrixDimension];
		for(int i=0; i<numbers.length; i++) {
			  for (int j = 0; j < numbers[i].length; j++) { 
			        numbers[i][j] = matrixDimension;
			         if (i == matrixDimension/2 && j == matrixDimension/2){
			        	System.out.print(centerValue + " ");
			        }else if (i == j) {
			            System.out.print( mainDiagValue + " ");
			        }else if (i + j == matrixDimension - 1){
			        	System.out.print(sndDiagValue + " ");
			        } else if (i < j && i +j < matrixDimension - 1){
			        	System.out.print(upValue + " ");
			        } else if (i < j && i +j > matrixDimension - 1){
			        	System.out.print(rightValue + " ");
			        }else if (i > j && i +j > matrixDimension - 1){
			        	System.out.print(bottomValue + " ");
			        } else if (i > j && i +j < matrixDimension - 1){
			        	System.out.print(leftValue + " ");
			        }else{
			            System.out.print(matrixDimension + " ");
			        }
			  }
			  System.out.println();
			}
		sc.close();
	}

}

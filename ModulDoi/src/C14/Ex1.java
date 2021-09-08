package C14;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int[][] numbers;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti marimea matricei: ");
		int n  = sc.nextInt();
		int unu = sc.nextInt();
		int doi = sc.nextInt();
		int trei = sc.nextInt();
		int patru = sc.nextInt();
		int cinci = sc.nextInt();
		int sase = sc.nextInt();
		int sapte = sc.nextInt();
		
		numbers = new int[n][n];
		for(int i=0; i<numbers.length; i++) {
			  for (int j = 0; j < numbers[i].length; j++) { 
			        numbers[i][j] = n;
			         if (i == n/2 && j == n/2){
			        	System.out.print(trei + " ");
			        }else if (i == j) {
			            System.out.print( unu + " ");
			        }else if (i + j == n - 1){
			        	System.out.print(doi + " ");
			        } else if (i < j && i +j < n - 1){
			        	System.out.print(cinci + " ");
			        } else if (i < j && i +j > n - 1){
			        	System.out.print(sase + " ");
			        }else if (i > j && i +j > n - 1){
			        	System.out.print(sapte + " ");
			        } else if (i > j && i +j < n - 1){
			        	System.out.print(patru + " ");
			        }else{
			            System.out.print(n + " ");
			        }
			  }
			  System.out.println();
			}
		sc.close();
	}

}

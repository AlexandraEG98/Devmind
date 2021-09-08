package c2;
import java.util.Scanner;
public class Ex3 {

public static void solutie(int [] array) {
		int count = 0;
		int [] newArray = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 0) {
				count ++;
			}
		}
//		for(int i = 0; i < count; i++) {
//			newArray [i] = 0;
//		}
		
		for (int i = 0; i < array.length; ++i) {
			if (array[i] != 0) {
				newArray[count] = array[i];
				++count;
			}
		}
		for(int j = 0; j < newArray.length; j++ ) {
			System.out.print(newArray[j] + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti dimensiune array: ");
		int n = sc.nextInt();
		int [] vector = new int [n];
		System.out.println("Introduceti elementele: ");
		for(int i = 0; i < n; i++) {
			 vector[i] = sc.nextInt() ;
 		}
		solutie(vector);
		sc.close();

	}

}

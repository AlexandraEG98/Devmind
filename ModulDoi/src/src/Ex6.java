package src;
import java.util.Scanner;
public class Ex6 {

	public static void solutie(int number) {
		
		for(int i = 0; i <= number; i++) {
			for(int j = i+1; j<= number; j++) {
				for (int k = j+1; k <= number; k++) {
					if( Math.pow(i,2) + Math.pow(j,2) == Math.pow(k,2)) {
						System.out.println(i + " " + j + " " + k );
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti un numar: ");
		int number = sc.nextInt();
		solutie(number);
		sc.close();
	}

}

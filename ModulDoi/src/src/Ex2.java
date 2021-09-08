package src;
import java.util.Scanner;
public class Ex2 {
	public static void solutie(int baza, int exp) {
		int [] number = new int [exp + 1];
		if(exp == 0) {
			number[0] = 1;
			
		}
		if(baza != 0) {
			number[0] = 1;
			number[1] = baza;
			for(int i = 2; i <= exp; i++) {
				number[i] =  number[i - 1] * baza ;
			}
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i] + " ");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti baza: ");
		int baza = sc.nextInt();
		System.out.println("Introduceti exponentul: ");
		int exp = sc.nextInt();
		solutie(baza, exp);
		sc.close();
	}

}

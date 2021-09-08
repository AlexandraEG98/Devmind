package src;
import java.util.Scanner;
public class Ex5 {

	public static void sir(int number) {
		int sum = 0;
		for(int i = 2; i < number / 2; i++) {
			if (isPrime(i) && sum < number) {
				sum += i;
				System.out.print(sum + " ");
			}
		}
	}
	
	public static boolean isPrime(int number) {
		
		for(int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti un numar: ");
		int number = sc.nextInt();
		sir(number);

		sc.close();
	}

}

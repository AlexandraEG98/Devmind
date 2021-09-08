package c2;
import java.util.Scanner;
public class Ex1 {
	public static void inv(int number) {
		int newNumber = 0;
			while(number > 0) {
				newNumber *= 10;
				newNumber += number % 10;
				number /= 10;
			}
		System.out.println(newNumber);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti un numar: ");
		int number = sc.nextInt();
		inv(number);
		sc.close();
	}

}

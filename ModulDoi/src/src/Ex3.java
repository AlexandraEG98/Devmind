package src;
import java.util.Scanner;
public class Ex3 {

	public static void cmmmcA(int number) {
		int y = number / 5;
		System.out.println("Cel mai mare multiplu de 5, mai mic sau egal cu " + number + " -> " + y * 5);
	}
	public static void cmmmcB(int number) {
		int y = number / 5;
		if(number == y * 5) {
			System.out.print("Cel mai mare multiplu de 5, mai mare sau egal cu " + number + " -> " + y * 5);
		}else {
			System.out.print("Cel mai mare multiplu de 5, mai mare sau egal cu " + number + " -> " + (y + 1)* 5);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti un numar: " );
		int number = sc.nextInt();
		cmmmcA(number);
		cmmmcB(number);
		sc.close();
	}
}
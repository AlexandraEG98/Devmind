package src;
import java.util.Scanner;
public class Ex4 {

	public static void solutie(int x, int y) {
		for(int i = x; i <= y; i++) {
			int numberX = divNumber(i);
			if(divNumber(numberX) == i && divNumber(numberX) < numberX  ) {
				System.out.println( divNumber(numberX) + " " + numberX);
			}
		}
	}
	public static int divNumber(int x) {
		int contor = 1;
		for(int i = 2; i < x; i++) {
			if(x % i == 0) {
				contor += i;
			}
		}
		return contor;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti limita din stanga: ");
		int left = sc.nextInt();
		System.out.println("Introduceti limita din dreapta;");
		int right = sc.nextInt();
		solutie(left, right);
		sc.close();
	}

}

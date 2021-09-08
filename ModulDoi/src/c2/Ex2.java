package c2;
import java.util.Scanner;
public class Ex2 {

	public static void myMathPowR(int n, int pow) {
		int number = 1;
		for(int i = 0; i < pow; i++) {
			number *= n;
		}
		System.out.println(n + " ^ "+ pow + " = " + number);
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti un numar: " );
		int number = sc.nextInt();
		System.out.println("Introduceti puterea la care doriti sa ridicati numarul: ");
		int pow = sc.nextInt();
		myMathPowR(number, pow);
		sc.close();

	}

}

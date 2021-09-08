package src;
import java.util.Scanner;
public class Ex1 {
	
	public static void solutie (int number) {
		int numberPerf = 1;
		while(number > numberPerf) {
			numberPerf *= 10;
		}
		System.out.println(numberPerf - number);
	}
	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	System.out.println("Introduceti un numar: ");
	int number = sc.nextInt();
	solutie(number);
	sc.close();
	}

}

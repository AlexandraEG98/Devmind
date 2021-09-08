package c2;
import java.util.Scanner;
public class Ex4 {

	
	public static void bubbleSortCrescator(double[] values) {
		
		for(int j = 0; j < values.length ; j++) {
			boolean check = false;
			for(int i = 0; i < values.length - 1 - j; i++) {
				if(values[i] > values[i+1]) {
					double aux = values[i+1];
					values[i+1] = values[i];
					values[i] = aux;
					check = true;
				}
			}	
			if(check == false) {
				break;
			}
		}
		
		for(int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
	}
	public static void bubbleSortDescrescator(double[] values) {
		for(int j = 0; j < values.length ; j++) {
			boolean check = false;
			for(int i = 0; i < values.length - 1 - j; i++) {
				if(values[i] < values[i+1]) {
					double aux = values[i+1];
					values[i+1] = values[i];
					values[i] = aux;
					check = true;
				}
			}
			if(check == false) {
				break;
			}
		}
		System.out.println();
		for(int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti numarul de elemente: ");
		double number = sc.nextDouble();
		double [] sir = new double[(int) number];
		for(int i = 0; i < sir.length; i++) {
			sir[i] = sc.nextInt();
		}
		bubbleSortCrescator(sir);
		bubbleSortDescrescator(sir);
		sc.close();
	}

}

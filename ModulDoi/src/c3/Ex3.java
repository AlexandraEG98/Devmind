package c3;
import java.util.Scanner;
public class Ex3 {
	public static int convertStringToNumber(String numberStr) {
		  char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		  int numValue = 0;

//		  for (int i=0; i < numberStr.length(); i++) {
//			    for (int j = 0; j < digits.length; j++) {
//			      if (numberStr.charAt(i) == digits[j]) {
//			        numValue = numValue * 10 + j;
//			      }
//			    }
//			  }
		  for (int i=0; i<numberStr.length(); i++) {
			    for (int j=0; j<digits.length; j++) {
			      if (numberStr.charAt(i) == digits[j]) {
			        numValue = numValue * 10 + numberStr.charAt(i) - 48;
			      }
			    }
			  }
		  return numValue;
		}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti un numar: ");
		String cifra = sc.next();
		System.out.println(convertStringToNumber(cifra));
		
		sc.close();

	}

}

package c11;

public class PolimorfismStatic {
	public static double ariaCerc(int raza) {
		double pi = 3.14;
		double aria = pi * raza * raza;
		return aria;
	}
	public static double ariaCerc(double raza) {
		double pi = 3.14;
		double aria = pi * raza * raza;
		return aria;
	}
	public static double ariaCerc(float raza) {
		double pi = 3.14;
		double aria = pi * raza * raza;
		return aria;
	}
	public static void main(String[] args) {
		System.out.println(ariaCerc(3));
		System.out.println(ariaCerc(56800));
		System.out.println(ariaCerc(3.67));
	}

}

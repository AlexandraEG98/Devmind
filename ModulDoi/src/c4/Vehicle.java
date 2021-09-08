package c4;
import java.lang.Math;
public class Vehicle {

	private static final String producedBy = "Honda";
	private final int productionYear;
	private String vin;	
	private String plateNumber;
	private double kilometers;
	private int lastSoldOnYear;
	private double positionX;
	private double positionY;
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public double getKilometers() {
		return kilometers;
	}
	public Vehicle(int productionYear) {
		this.productionYear = productionYear;
	}
	public Vehicle(int productionYear, int kilometers) {
		this(productionYear);
		this.kilometers = kilometers;
	}
	public Vehicle(int productionYear, int kilometers, String vin) {
		this(productionYear, kilometers);
		this.vin = vin;
	}
	public void sellVehicle(String plateNumber, int lastSoldOnYear) {
		this.plateNumber = plateNumber;
		this.lastSoldOnYear = lastSoldOnYear;
	}
	public void moveCar(double positionX, double positionY) {
		this.kilometers = Math.sqrt(((positionX - this.positionX) * (positionX - this.positionX)) +
				((positionY - this.positionY) * (positionY - this.positionY)));
	}
	public void isDrivingInNorthAmerica(String vin) {
		////Transformarea VIN-ului in cifre
		int [] value = new int[17];
		System.out.println("VIN-ul: " + vin);
		int sum = 0;
		
		for(int i = 0; i < vin.length(); i++) {
			if (vin.charAt(i) == 88) { //Sare peste X
				continue;
			}
			if(vin.charAt(i) > 64) { // in cazul literelor
				value[i] += (vin.charAt(i) - 64) % 9;
			} else { // in cazul cifrelor
				value[i] += vin.charAt(i) - 48;
			}
		}
		System.out.print("Value:  ");
		
		for(int i = 0; i < value.length; i++) { 
			System.out.print(value[i] + " ");
		}
		System.out.println();
		
		// Construirea  unui array weight && efectuarea operatiei de inmultire intre vin si weight
		int [] weight = {8, 7, 6, 5, 4, 3, 2, 10, 0, 9, 8, 7, 6, 5, 4, 3, 2};
		System.out.print("Weight: ");
		for(int i = 0; i < weight.length; i++) {
			System.out.print(weight[i] + " ");
		}
		int [] products = new int[17];
		
		System.out.print("\nProducts: ");
		
		for(int i = 0; i < products.length; i++) {
			products[i] = value[i] * weight[i];
			sum += products[i];
			System.out.print(products[i] + " ");
		}	
		// gruparea vinului in 2 parti si verificarea daca este valid
		String vinLeft = "";
		String vinRight = "";
		for(int i = 0; i < vin.length() / 2; i++) {
			vinLeft += vin.charAt(i);
		}		
		for(int i = vin.length() / 2 + 1; i < vin.length(); i++) {
			vinRight += vin.charAt(i);
		}
		
		String vinNou = "";
		
		if(sum % 11 == 10) {
			vinNou = vinLeft + "X" + vinRight;
			System.out.println("\nVIN-ul introdus este valid: " + vinNou);
		} else {
			vinNou = vinLeft + sum % 11 + vinRight; // pe pozitia 9 afisam restul impartirii la 11
			System.out.println("VIN-ul introdus nu este valid: " + vinNou);
		}
	}
	public String substring(String source, int beginIndex, int endIndex) {
		String print = "";
		for(int i = beginIndex; i <= endIndex; i++) {
			print += source.charAt(i);
		}
		return print;
	}
	public String display() {
		return   "Va prezint una din cele mai elegante masini din categoria " + this.producedBy + "." + " \nEste un model nou din " + this.productionYear +
				", care vine cu foarte multe imbunatatiri si design inovator.\n" + this.vin + " este seria VIN, cu un numar de " + this.kilometers + " km avand numarul de inmatriculare " +
				this.plateNumber + ". \nUltima vanzare a avut loc in anul " + this.lastSoldOnYear + ". \nMasina se afla la longitudinea " + this.positionX + " si latitudinea " 
				+ this.positionY;
	}

}

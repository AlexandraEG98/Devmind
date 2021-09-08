package c4;

public class Main {
	public static void main(String[] args) {
		Vehicle Costi = new Vehicle(2020, 500, "1M8GDM9AXKP042788");
		Costi.setPlateNumber("B1431VAN");
		Costi.moveCar(500, 700);
		Costi.sellVehicle("B1431VAN", 2019);
		String vin = "1M8GDM9AXKP042788";
		Costi.isDrivingInNorthAmerica(vin);
		System.out.println("Identificator producator: " + Costi.substring(vin, 0, 2));
		System.out.println("Atributele vehiculului: " + Costi.substring(vin, 3, 7));
		System.out.println("Cifra de verificare: " + Costi.substring(vin, 8, 8));
		System.out.println("Anul productiei modelului: " + Costi.substring(vin, 9, 9));
		System.out.println("Seria fabricii: " + Costi.substring(vin, 10, 10));
		System.out.println("Identificatorul numeric: " + Costi.substring(vin, 11, 16));
		System.out.println(Costi.display());
	
	}
}

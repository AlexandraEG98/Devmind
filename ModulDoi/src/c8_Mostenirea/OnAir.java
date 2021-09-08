package c8_Mostenirea;

public class OnAir extends Vehicle {
	private int noTurbines = 2;
	private String hasFirstClass;
	
	public OnAir(String serialNumber,int noPersons) {
		super(serialNumber, noPersons);
	}
	public OnAir(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
	}
	public OnAir(String serialNumber, int noPersons, String name, int noTurbines) {
		this(serialNumber, noPersons, name);
		this.noTurbines = noTurbines;
	}
	public OnAir(String serialNumber, int noPersons, String name, int noTurbines, String hasFirstClass) {
		this(serialNumber, noPersons, name, noTurbines);
		this.hasFirstClass = hasFirstClass;
	}
	@Override
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Flying the airplane to coordinates: [" + positionX + " , " + positionY + "]");
		return true;
	}
	@Override
	public boolean addFuel(double amount) {
		System.out.println("Adding " + amount + " l of fuel to the airplane");
		return true;
	}
	@Override
	public void printInfo() {
		System.out.println("Vehicle properties:\r\n"
				+ "	- serial number: " + getSerialNumber() + " \r\n"
				+ "	- capacity: " +  getNoPersons() + " persons\r\n"
				+ "	- name: " + getName() +  " \r\n"
				+ "Airplane properties:\r\n"
				+ "	- number of turbines: " + noTurbines + " \r\n"
				+ "	- has first class: " + hasFirstClass);
//				+ "Vehicle properties:\r\n"
//				+ "	- serial number: BC325987DFKJS34\r\n"
//				+ "	- capacity: 20 persons\r\n"
//				+ "	- name: Localsky\r\n"
//				+ "Airplane properties:\r\n"
//				+ "	- number of turbines: 2\r\n"
//				+ "	- does not have first class");
	}
}

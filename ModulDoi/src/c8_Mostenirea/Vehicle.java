package c8_Mostenirea;

public class Vehicle {

	private final String serialNumber;
	private int noPersons;
	private String name;
	
	public Vehicle (String serialNumber, int noPersons) {
		this.serialNumber = serialNumber;
		this.noPersons = noPersons;
	}
	public Vehicle(String serialNumber, int noPersons, String name) {
		this(serialNumber, noPersons);
		this.name = name;
	}
	public final String getSerialNumber() {
		return this.serialNumber;
	}
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Error: unknown vehicle cannot move…");
		return false;
	}
	public boolean addFuel(double amound) {
		System.out.println("Error: unknown type of vehicle…");
		return false;
	}
	public void printInfo() {
		System.out.println("Vehicle properties:\r\n"
				+ "	- serial number: " + serialNumber + "\r\n"
				+ "	- capacity: " + noPersons + " persons\r\n"
				+ "	- name: " + name);
	}
	public int getNoPersons() {
		return this.noPersons;
	}
	public String getName() {
		return this.name;
	}
}

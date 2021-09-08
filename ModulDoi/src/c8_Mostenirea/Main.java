package c8_Mostenirea;

public class Main {

	public static void main(String[] args) {
		
		Vehicle Moby = new Vehicle("3FDS9DFF8FSD7", 4 , "Moby");
		Moby.printInfo();
		
		OnRoad Sporty = new OnRoad("FDFL8KMFSDLKM6", 2, "Sporty", 4 , 2);
		Sporty.printInfo();
		
		OnWater Wavess = new OnWater("F8GFDG86D87GGD", 20, "Wavess", 2, 2000);
		Wavess.printInfo();
		
		OnAir Bluesky = new OnAir("GJR96GDF98DF9ND", 120, "Bluesky", 4, "Yes");
		Bluesky.printInfo();
		
		OnAir Localsky = new OnAir("BC325987DFKJS34", 20, "Localsky", 2, "No");
		Localsky.printInfo();
	}

}

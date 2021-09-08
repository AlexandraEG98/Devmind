package c11;

public class Pixel {

	private String color;
	
	public String getColor() {
		return this.color;
	}
	public Pixel(){
		this.color = "#FFFFFF";
	} 
	public Pixel(String color) {
		this.color = color;
	}
	public void setPixel(String color) {
		this.color = color;
	}
}

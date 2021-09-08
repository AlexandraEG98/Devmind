package c11;

import java.util.ArrayList;

public class Screen {

	private ArrayList <Pixel> pixels;
	private Dimensions dimensions;
	
	public Screen( int numberPixel, int width, int length, int depth) {
		this.setDimensions(new Dimensions ( width,  length,  depth));
		for(int i = 0; i < numberPixel ; i++) {
			Pixel thePixel;
			thePixel = new Pixel();
			this.pixels.add(thePixel);
		}
	}
	public void setPixel(int pixels, String color) {
		Pixel thePixel;
		thePixel = this.pixels.get(pixels);
		thePixel.setPixel(color);
	}
	public void colorScreen(String color) {	
		for(int i = 0; i <= pixels.size(); i++) {
			setPixel(i, color);
		}	
	}
	public Dimensions getDimensions() {
		return dimensions;
	}
	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}
}


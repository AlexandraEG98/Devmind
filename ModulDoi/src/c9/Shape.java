package c9;

import java.util.Objects;

public abstract class Shape {

	public String text;
	public String material;

	public Shape() {

	}

	public Shape(String text, String material) {
		this.text = text;
		this.material = material;
	}

	public abstract double getSize();

	
	public abstract String toString() ;

	
	public abstract int hashCode() ;

	
	public abstract boolean equals(Object obj) ;
	

}

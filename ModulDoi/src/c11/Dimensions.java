package c11;

public class Dimensions {

	private final int width;
	private final int length;
	private final int depth;
	
	public Dimensions(int width, int length, int depth) {
		this.width = width;
		this.length = length;
		this.depth = depth;
	}

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}

	public int getDepth() {
		return depth;
	}

}

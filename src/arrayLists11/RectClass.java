package arrayLists11;

public class RectClass {
	private int length;
	private int width;

	public RectClass() {
		length = 10;
		width = 10;
	}

	public RectClass(int xLength, int xWidth) {
		length = xLength;
		width = xWidth;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public void setLength(int xLength) {
		length = xLength;
	}

	public void setWidth(int xWidth) {
		width = xWidth;
	}

	public int perimeter() {
		return length * 2 + width * 2;
	}

	public int area(double c) {
		return length * width;
	}

}

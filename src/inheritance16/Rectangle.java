package inheritance16;

public class Rectangle extends Parallelogram implements Geo{
	public Rectangle() {
		super();
	}

	public Rectangle(double length, double width) {
		super(length, width, width);
	}

	public double area() {
		return super.get1() * super.get2();
	}
}

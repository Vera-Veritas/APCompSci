package inheritance16;

public class Trapezoid extends Quadrilateral implements Geo{
	private double height;

	public Trapezoid() {
		super();
		height = 4;
	}

	public Trapezoid(double b1, double s2, double b3, double s4, double xh) {
		super(b1, s2, b3, s4);
		height = xh;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double xht) {
		height = xht;
	}

	public double area() {
		return ((super.get1() + super.get3()) / 2) * height;
	}
}

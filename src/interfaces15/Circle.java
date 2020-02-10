package interfaces15;

public class Circle implements Shape{
	private double radius;

	public Circle() {
		radius = 5;
	}

	public Circle(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public double perimeter() {
		return (2 * radius * Math.PI);
	}

	public double area() {
		return (Math.PI * radius * radius);
	}
}

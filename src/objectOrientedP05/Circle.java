package objectOrientedP05;

public class Circle {
	private double radius;

	public Circle() {
		radius = 1;
	}

	public Circle(double xradius) {
		if (xradius<0)
			radius = xradius * (-1);
		if (xradius>=0)
			radius = xradius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newradius) {
		radius = newradius;
	}
	public double circumference(){
		radius = radius*2*Math.PI;
		return radius;
	}
	public double area(){
		radius = Math.PI*Math.pow(radius,2);
		return radius;
	}
}

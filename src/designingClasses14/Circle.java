package designingClasses14;

public class Circle {
	private double radius;

	public Circle() {
		radius = 5;
	}

	public Circle(double r) {
		radius = r;
	}
	public double getRadius(){
		return radius;
	}

	public double perimeter() {
		return (2 * radius * Math.PI);
	}

	public double area() {
		return (Math.PI * radius * radius);
	}
	
	public String toString(){
		return "Circle: radius =" + radius;
	}
	public boolean equals(Object otherObj){
		return (this.toString().equals(otherObj.toString()));
	}
}

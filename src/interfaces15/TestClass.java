package interfaces15;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// Rectangle bob = new Rectangle();
		// Circle bob = new Circle();
		System.out.println("length of rect:");
		double length = input.nextInt();
		System.out.println("width of rect:");
		double width = input.nextInt();
		Shape bob = new Rectangle(length, width);
		System.out.println("area: " + bob.area());
		System.out.println("perimeter " + bob.perimeter());
		
		System.out.println("\nradius of circ:");
		double radius = input.nextInt();
		Shape joe = new Circle(radius);
		System.out.println("area: " + joe.area());
		System.out.println("perimeter " + joe.perimeter());
	}

}

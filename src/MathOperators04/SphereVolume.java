package MathOperators04;

import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius = -999;
		double total = -999;

		System.out.println("What is the radius of the sphere?");
		radius = input.nextDouble();

		total = (4.0 / 3.0) * Math.PI * (radius * radius * radius);
		// how you add pi into program, one way at least

		System.out.println("The volume of the sphere is " + total + ".");
	}

}

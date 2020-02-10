package MathOperators04;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius = -999;
		double total = -999;

		System.out.println("What is the radius of the circle?");
		radius = input.nextDouble();

		total = Math.PI * (radius * radius);
		// how you add pi into program, one way at least

		System.out.println("The area of the circle is: " + total);
	}

}

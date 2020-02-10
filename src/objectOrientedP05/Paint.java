package objectOrientedP05;

import java.util.Scanner;

public class Paint {
	Scanner input = new Scanner(System.in);

	public void sayWelcome() {
		System.out.println("Welcome to Paint class.");
	}

	public void paintWall() {
		System.out.println("What is the length of the wall in feet?");
		int length = input.nextInt();
		System.out.println("What is the height of the wall in feet?");
		int height = input.nextInt();
		System.out.println("How many coats of paint?");
		int coats = input.nextInt();
		double sqft = Math.ceil((length * height * coats) / 150.0);
		System.out.println("Gallons of paint needed (gal=150 sq ft): " + sqft);
	}

	public void conversion() {
		System.out.println("How many square yards?");
		int yards = input.nextInt();
		int feet = yards * 9;
		System.out.println(yards + " square yards = " + feet + " square feet");
	}
}

package MathOperators04;

import java.util.Scanner;

public class LetsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int HEIGHT = 8;
		int length = -999;
		int width = -999;
		int area = -999;
		final double GAL = 150;
		int totgal = -999;

		System.out.println("What is the length of the wall in feet?");
		length = input.nextInt();
		System.out.println("What is the width of the wall in feet?");
		width = input.nextInt();

		area = 2 * length * HEIGHT + 2 * width * HEIGHT;
		totgal = (int)Math.ceil(area / GAL); //GAL has to be double to round up
		System.out.println("Room Dimensions:\nHeight: " + HEIGHT + "\nLength: " + length + "\nWidth: " + width);
		System.out.println("Area needed to cover: " + area);
		System.out.println("Gallons of paint needed: " + totgal);

	}

}

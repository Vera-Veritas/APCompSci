package MathOperators04;

import java.util.Scanner;

public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int HEIGHT = 8;
		int width = -999;
		int area = -999;

		System.out.println("What is the width of the wall in feet?");
		width = input.nextInt();

		area = HEIGHT*width;
		
		System.out.println("The area of the wall is " + area + " sq. feet.");

	}

}

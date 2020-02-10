package MathOperators04;

import java.util.Scanner;

public class VolumeOfBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int length = -999;
		int width = -999;
		int height = -999;
		int total = -999;

		System.out.println("What's the length of the box?");
		length = input.nextInt();
		System.out.println("What's the width of the box?");
		width = input.nextInt();
		System.out.println("What's the height of the box?");
		height = input.nextInt();

		total = length * width * height;

		System.out.println("The volume of the box is: " + total);
	}

}

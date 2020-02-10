package objectOrientedP05;

import java.util.Scanner;

public class PlantTG2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		PlantTG2 bob = new PlantTG2();
		//bob.plantGard();

		int width = 10;
		System.out.println("What is the length of the garden in feet?");
		int length = input.nextInt();
		System.out.println("How many rows in the garden?");
		int row = input.nextInt();
		double time = bob.plantGard(length, row);
		System.out.println("Hours needed to plant garden: " + time);
	}

}

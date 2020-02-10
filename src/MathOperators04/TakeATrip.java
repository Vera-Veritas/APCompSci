package MathOperators04;

import java.util.Scanner;

public class TakeATrip {
	// find cost of travel

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double dist = -999.0;
		double gal = -999.0;
		double gascost = -999.0;
		double mpg = -999.0;
		double total = -999.0;

		System.out.println("How far did you travel in miles?");
		dist = input.nextDouble();
		System.out.println("What is your car's MPG?");
		mpg = input.nextDouble();
		System.out.println("What was the total you spent on gas?");
		gascost = input.nextDouble();

		gal = dist / mpg;
		total = gascost / gal;

		System.out.println("The total distance traveled was was: " + dist);
		System.out.println("Gallons of gas used: " + gal);
		System.out.println("The cost spent on gas was: " + gascost);
		System.out.println("The average cost per gallon of gas was: " + total);

	}

}

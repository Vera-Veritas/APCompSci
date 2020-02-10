package MathOperators04;

import java.util.Scanner;

public class CuttinMoreGrass {
//doesn't work :(
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length = -999;
		double width = -999;
		double area = -999;
		double widthmo = -999;
		double mph = -999;
		double inchLength = -999;
		double inchWidth = -999;
		int runs = -999;
		double totLength = -999;
		double cost = -999;
		double time = -999;

		System.out.println("What is the length of the lawn in feet?");
		length = input.nextInt();
		System.out.println("What is the width of the lawn in feet?");
		width = input.nextInt();
		System.out.println("What is the width of the mower in inches?");
		widthmo = input.nextInt();
		System.out.println("What is the speed of the mower in mph?");
		mph = input.nextInt();

		inchLength = length * 12;
		inchWidth = width * 12;
		runs = (int) Math.ceil(length / widthmo);
		totLength = runs * width;
		time = totLength / (mph * 63360);
		cost = time * 12;

		System.out.println("Amount of time needed for lawn service: " + time);
		System.out.println("Cost for lawn service: " + cost);

	}

}

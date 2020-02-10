package MathOperators04;

import java.util.Scanner;

public class CuttinGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length = -999;
		double width = -999;
		double area = -999;
		double radius = -150;
		double cost = -999;
		double round = -999;

		System.out.println("What is the length of the lawn in yards?");
		length = input.nextInt();
		System.out.println("What is the width of the lawn in yards?");
		width = input.nextInt();
		System.out.println("What is the radius of the fountain in feet?");
		radius = input.nextInt();

		area = length * width * 3;
		area = area - (radius * 2 * Math.PI);
		cost = area / 100 * 1.25;
		round = (area % 100) * 0.00125;
		cost = cost + round;

		System.out.println("Cost for lawn service: " + cost);

	}

}

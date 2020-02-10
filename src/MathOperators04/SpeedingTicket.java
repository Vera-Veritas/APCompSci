package MathOperators04;

import java.util.Scanner;

public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int limit = -999;
		int driver = -999;
		int speeding = -999;
		int total = -999;

		System.out.println("What was the speed limit?");
		limit = input.nextInt();
		System.out.println("What was the speed of the driver?");
		driver = input.nextInt();

		speeding = driver - limit;
		total = (speeding - 1) * 40 + 55;

		if (speeding > 0) {
			System.out.println("The speed limit was: " + limit);
			System.out.println("The speed of the driver was: " + driver);
			System.out.println("The cost of the ticket is: " + total);
		}
		if (speeding < 0) {
			System.out.println("You obeyed the law.");
		}
	}

}

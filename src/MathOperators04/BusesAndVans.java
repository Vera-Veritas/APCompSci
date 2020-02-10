package MathOperators04;

import java.util.Scanner;

public class BusesAndVans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int ppl = -999;
		int bus = -999;
		int left = -999;

		System.out.println("How many people need a ride today?");
		ppl = input.nextInt();

		bus = ppl / 35;
		left = ppl % 35;

		System.out.println("You need to order this many buses: " + bus);
		System.out.println(left + " people left need to ride vans.");

	}

}

package loops07;

import java.util.Scanner;

public class Allowance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type the day");
		int counter = 0;
		int cent = 1;
		double total = 0;
		int day = input.nextInt();
		for (counter = 1; counter <= day; counter++) {
			total += cent;
			cent *= 2;
		}
		total = total / 100;
		System.out.println("total: " + (total));
	}
}

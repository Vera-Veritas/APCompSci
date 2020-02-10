package MathOperators04;

import java.util.Scanner;

public class Ages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int bud1 = -999;
		int bud2 = -999;
		int bud3 = -999;
		int total = -999;

		System.out.println("What the age of your first friend?");
		bud1 = input.nextInt();
		System.out.println("What the age of your second friend?");
		bud2 = input.nextInt();
		System.out.println("What the age of your third friend?");
		bud3 = input.nextInt();

		total = bud1+bud2+bud3;
		
		System.out.println("The sum of the ages of your 3 friends is " + total+".");
	}

}

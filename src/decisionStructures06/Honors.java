package decisionStructures06;

import java.util.Scanner;

public class Honors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your GPA?");
		double gpa = input.nextDouble();
		System.out.println("What class are you in? (year of 20XX)");
		int year = input.nextInt();
		if (year == 2020 && gpa >= 3.5)
			System.out.println("You will graduate with honors.");
		else
			System.out.println("You will graduate without honors or you are not old enough.");

	}

}

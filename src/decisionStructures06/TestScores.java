package decisionStructures06;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What did you get on test 1?");
		double test1 = input.nextDouble();
		System.out.println("What did you get on test 2?");
		double test2 = input.nextDouble();
		System.out.println("What did you get on test 3?");
		double test3 = input.nextDouble();

		double avg = (test1 + test2 + test3) / 3;
		if (avg >= 69.5) {
			if (avg < 77.5)
				System.out.println("You have a D");
			else {
				if (avg < 84.5)
					System.out.println("You have a C");
				else {
					if (avg < 92.5)
						System.out.println("You have a B");
					else
						System.out.println("You have an A");
				}

			}
		}
		else
			System.out.println("You have an F");

	}
}
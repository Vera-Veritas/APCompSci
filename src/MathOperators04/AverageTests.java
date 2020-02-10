package MathOperators04;

import java.util.Scanner;

public class AverageTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t1 = -999;
		int t2 = -999;
		int t3 = -999;
		int avg = -999;

		System.out.println("Type in all answers in integers");
		System.out.println("What percent did you get on your first test?");
		t1 = input.nextInt();
		System.out.println("What percent did you get on your second test?");
		t2 = input.nextInt();
		System.out.println("What percent did you get on your third test?");
		t3 = input.nextInt();

		avg = (t1 + t2 + t3) / 3;

		System.out.println("The average of your tests was: " + avg);

	}

}

package input03;

import java.util.Scanner;

public class SampleAssessmentMDY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int month = -999;
		int day = -999;
		int year = -999;

		System.out.println("What's the month?");
		month = input.nextInt();
		System.out.println("What's the date?");
		day = input.nextInt();
		System.out.println("What's the year?");
		year = input.nextInt();

		System.out.println("It is " + month + "-" + day + "-" + year);
	}

}

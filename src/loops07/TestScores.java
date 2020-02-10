package loops07;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double total = 0;
		int passed = 0;
		int taken = 0;
		System.out.println("Type a test score/percentage");
		double test = input.nextDouble();

		while (test != 9999){
		if (test >= 69.5){
		passed++;
		total+=test;
		}
		taken++;
		System.out.println("Type another test score/percentage (9999 to stop)");
		test = input.nextDouble();

		}

		System.out.println("Number of tests passed: "+ passed +" out of "+ taken);
		System.out.println("Your average test score: "+ (total/passed));

	}

}

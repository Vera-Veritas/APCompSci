package input03;

import java.util.Scanner;

public class ProgramOppLockerCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int num1 = -999;
		int num2 = -999;
		int num3 = -999;

		System.out.println("Type in all numbers with 2 digits. \nex: \"3\" has to be written as \"03\"");
		System.out.println("\nWhat's the first number?");
		num1 = input.nextInt();
		System.out.println("What's the second number?");
		num2 = input.nextInt();
		System.out.println("What's the third number?");
		num3 = input.nextInt();

		System.out.println(num1 + " - " + num2 + " - " + num3);
	}

}

package input03;

import java.util.Scanner;

public class ProgramOppPasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int num1 = -999;
		int num2 = -999;
		int num3 = -999;

		System.out.println("Type in all numbers within 1 digits.");
		System.out.println("\nWhat's the first number?");
		num1 = input.nextInt();
		System.out.println("What's the second number?");
		num2 = input.nextInt();
		System.out.println("What's the third number?");
		num3 = input.nextInt();

		System.out.println("Combination #1= "+num1 + num2 + num3);
		System.out.println("Combination #2= "+num1 + num3 + num2);
		System.out.println("Combination #3= "+num2 + num1 + num3);
		System.out.println("Combination #4= "+num2 + num3 + num1);
		System.out.println("Combination #5= "+num3 + num1 + num2);
		System.out.println("Combination #6= "+num3 + num2 + num1);
		}

}

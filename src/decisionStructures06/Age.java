package decisionStructures06;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What's your age?");
		int age = input.nextInt();
		int agecheck = 16;
		System.out.println(("You are 16:") + (agecheck == age));

		// System.out.println("What's your second age?");
		// int age2 = input.nextInt();
		if (age >= 18)
			System.out.println("You will be charged as an adult.");
		System.out.println("Have a nice day!");
	}

}

package MathOperators04;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = -999;

		System.out.println("How old are you?");
		age = input.nextInt();

		age = 18 - age;

		if (age > 0) {
			System.out.println("You will be able to vote in " + age + " years.");
		}
		if (age < 0) {
			System.out.println("You were already able to vote " + age * -1 + " years ago!");
		}

	}

}

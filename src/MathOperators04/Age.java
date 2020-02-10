package MathOperators04;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int age = -999;

		System.out.println("What's your age?");
		age = input.nextInt();

		age = age + 7;	//learning how to use operators

		System.out.println("In 7 years you will be " + age + " years old.");
	}

}

package decisionStructures06;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("You an adult (true of false)");
		boolean answ = input.nextBoolean();
		if (answ == true) {
			System.out.println("What is your height?");
			double height = input.nextDouble();
			System.out.println("Lucky Number: " + (height*5));
		} 
		else {
			System.out.println("What is your weight?");
			double weight = input.nextDouble();
			System.out.println("Lucky Number: " + (weight/2));

		}
	}

}

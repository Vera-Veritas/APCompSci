package loops07;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int total = 0;
		System.out.println("Type an integer");
		int num = input.nextInt();
		for (counter = 1; counter < num; counter += 2) {
			total += counter;
		}
		System.out.println("sum of the odd integers less than the inputted number: " + total);
	}

}

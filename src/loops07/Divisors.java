package loops07;

import java.util.Scanner;

public class Divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int total = 0;
		int not = 0;
		System.out.println("Type an integer");
		int num = input.nextInt();
		for (counter = 1; counter <= num; counter++) {
			if (num % counter >= 1)
				not++;
			else
				total++;
		}
		System.out.println("number of factors: " + total);
	}

}

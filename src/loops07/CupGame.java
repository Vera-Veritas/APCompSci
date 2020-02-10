package loops07;

import java.util.Random;
import java.util.Scanner;

public class CupGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random num = new Random();
		int choice;
		int cup;
		int end;
		int wins =0;
		int runs = 0;

		do {
			System.out.println("Let's Play! Choose a number: 1, 2, or 3");
			choice = input.nextInt();
			cup = num.nextInt(3) + 1;
			if (choice == cup) {
				System.out.println("You win!!!");
				wins++;
				runs++;
			} else {
				System.out.println("You lose.");
				runs++;
			}
			System.out.println("Do you want to play again? 1 for yes, 2 for no");
			end = input.nextInt();
		} while (end != 2);
		System.out.println("You won " + wins+ " out of "+runs+ " times");
		System.out.println("Winning percentage: "+ ((double)wins/runs));

	}

}

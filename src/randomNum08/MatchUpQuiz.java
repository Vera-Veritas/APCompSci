package randomNum08;

import java.util.Scanner;
import java.util.Random;

public class MatchUpQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random nugget = new Random(5);
		int answ = 0;
		int count;

		int one;
		int two;
		int three;

		int wins = 0;
		int losses = 0;

		int winning = 0;

		do {
			for (count = 1; count <= 3500; count++) {
				one = nugget.nextInt(6);
				two = nugget.nextInt(6);
				three = nugget.nextInt(6);
				if (one == two && two == three) {
					wins++;
				} else {
					losses++;
				}
				if (wins > winning) {
					winning = wins;
				}
			}
			System.out.println("Iteration done.");
			System.out.println("Play again? 0 for yes, 999 for no");
			answ = input.nextInt();
		} while (answ != 999);
		System.out.println("Highest Winning Percentage of All Simulations: " + ((double) winning / 3500));
	}

}

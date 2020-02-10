package arrays10;

import java.util.Random;
import java.util.Scanner;

public class RollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random cat = new Random();
		int[] rolls = new int[10000];
		int c;
		for (c = 0; c < rolls.length; c++) {
			rolls[c] = cat.nextInt(5);
		}
		int answ=0;
		do{
			System.out.println("Choose a roll to see (1-10000)");
			int find = input.nextInt()-1;
			System.out.println(rolls[find]);
			System.out.println(" Find another roll? (1 for yes, 0 for no)");
			answ = input.nextInt();
		}while(answ==1);
		System.out.println("done.");

	}

}

package loops07;

import java.util.Scanner;

public class HowManyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		int runs = 0;
		int total = 0;
		do {
			System.out.println("Type an integer");
			num = input.nextInt();
			total += num;
			runs++;
		} while (total <= 2019);
		System.out.println("2019 reached!");
		System.out.println("How many numbers it took to type in: " + runs);

	}

}

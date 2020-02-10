package loops07;

import java.util.Scanner;

public class ForHello6 { // fixed for bad data

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int num;
		do {
			System.out.println("How many \"Hello World\"s would you like?");
			num = input.nextInt();
		} while (num < 0);
		if (num == 0)
			System.out.println("Goodbye World");
		else {
			for (counter = 1; counter <= num; counter++) {
				System.out.println(counter + " Hello World");
			}
		}
	}

}

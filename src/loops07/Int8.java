package loops07;

import java.util.Scanner;	//display avg of all nums typed

public class Int8 {								//no Int 7

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num = 0;
		double total = 0;
		double numbers = 0;
		System.out.println("Type a number (9999 to quit)");
		num = input.nextDouble();

		while (Math.abs(num - 9999) > 0.01) {
			total += num;

			System.out.println("Type a number (9999 to quit)");
			num = input.nextDouble();
			numbers++;

		}
		System.out.println("9999: terminated");
		System.out.println(total/numbers);
	}

}

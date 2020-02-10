package loops07;

import java.util.Scanner;	//display all nums typed in

public class Int6 {									//no Int 7

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num = 0;
		double total = 0;
		System.out.println("Type a number (9999 to quit)");
		num = input.nextDouble();

		while (Math.abs(num - 9999) > 0.01) {
			total += num;

			System.out.println("Type a number (9999 to quit)");
			num = input.nextDouble();

		}
		System.out.println("9999: terminated");
		System.out.println(total);

	}

}

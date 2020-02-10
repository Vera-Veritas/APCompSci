package loops07;

import java.util.Scanner;

public class SumTheNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num2;
		System.out.println("Type an integer");
		int num1 = input.nextInt();

		do {
			System.out.println("Type an integer");
			num2 = input.nextInt();
			System.out.println(num1 + num2);
			System.out.println("Type an integer (999 to stop)");
			num1 = input.nextInt();
		} while (num1 != 999);
	}

}

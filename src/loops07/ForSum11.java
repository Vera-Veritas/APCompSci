package loops07;

import java.util.Scanner;

public class ForSum11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int sum = 0;
		int num;
		for (counter = 1; counter <= 5; counter++) {
			System.out.println("Type a num");
			num = input.nextInt();
			sum += num;
		}
		System.out.println("The sum of the numbers are: " + sum);
	}

}

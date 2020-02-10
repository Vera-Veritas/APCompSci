package loops07;

import java.util.Scanner;

public class LargestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double counter = 0;
		double fin = 999;
		System.out.println("Type an integer");
		int num = input.nextInt();
		for (counter = 1; counter <= num; counter++) {
			if ((num % (num - counter)) == 0) {
				fin = num - counter;
				break;
			}
			
		}
		System.out.println("largest factor: " + fin);
	}

}

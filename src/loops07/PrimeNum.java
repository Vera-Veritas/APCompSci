package loops07;

import java.util.Scanner;

public class PrimeNum { //doesn't work

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double counter = 0;
		double fin = 999;
		System.out.println("Type an integer");
		int num = input.nextInt();
		System.out.println("Prime factorization for " + num);
		for (counter = 1; counter <= num; counter++) {
			if ((num % (num - counter)) == 0) {
				fin = num - counter;
				//break;
			}
		//	if (total == 2)
		//		System.out.println(num + " is a(n) prime number");
		//	else
		//		System.out.println(num + " is not a(n) prime number");
		}

	}
}

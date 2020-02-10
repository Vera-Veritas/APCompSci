package loops07;

import java.util.Scanner;

public class ForHello8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int counter = 0;
		int sum = 0;
		for (counter = 1; counter<=10; counter++) {			
			sum+=counter;
		}
		System.out.println(sum + " is sum of integers from 1 to 10");
	}

}

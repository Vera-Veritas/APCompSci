package loops07;

import java.util.Scanner;

public class ForHello9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int counter = 0;
		int sum = 0;
		for (counter = 4; counter<=28; counter+=2) {			
			sum += counter;
		}
		System.out.println(sum + " is sum of integers from 4 to 28");
	}

}

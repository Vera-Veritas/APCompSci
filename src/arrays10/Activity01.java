package arrays10;

import java.util.Scanner;

public class Activity01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int c;
		double[] scores = new double[5];
		for (c = 0; c < 5; c++) {
			System.out.println("Enter test score " + (c+1));
			scores[c] = input.nextDouble();
		}
		for (c = 4; c >= 0; c--) {
			System.out.println("Test " + (c+1) + ": " + scores[c]);
		}
	}

}

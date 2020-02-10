package wrapperAndForEach12;

import java.util.Random;
import java.util.Scanner;

public class ActSearchInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random cat = new Random();
		int[] num = new int[100];
		int c;
		for (c = 0; c < num.length; c++) {
			num[c] = (cat.nextInt(500));
		}
		int inThere = 0;
		System.out.println("Search for a number");
		int search = input.nextInt();
		for (int x : num)
			if (x == search) {
				inThere++;
			}
		System.out.println("Integers found: " + inThere);
	}

}

package loops07;

import java.util.Scanner;

public class Stats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int total = 0;
		int num;
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for (counter = 1; counter <= 9; counter++) {
			System.out.println("Type an integer");
			num = input.nextInt();
			if (num >= largest)
				largest = num;
			if (num <= smallest)
				smallest = num;
			total += num;
		}
		System.out.println("sum: " + total);
		System.out.println("avg: " + (total / 9));
		System.out.println("range: " + (largest - smallest));
	}

}

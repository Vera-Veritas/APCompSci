package loops07;

import java.util.Scanner;

public class ClassAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int total = 0;
		System.out.println("How many students?");
		int students = input.nextInt();
		for (counter = 1; counter <= students; counter++) {
			System.out.println("Test for student " + counter + "?");
			int test = input.nextInt();
			total += test;
		}
		System.out.println("class avg: " + ((double) total / students));
	}

}

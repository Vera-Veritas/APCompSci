package loops07;

import java.util.Scanner;

public class LargeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Type a test score/percentage");
		double test = input.nextDouble();
		double largest = test;
		double smallest = test;

		while (test != 9999){
		if(test >= largest)
		largest = test;
		if(test <= smallest)
		smallest = test;

		System.out.println("Type another test score/percentage (9999 to stop)");
		test = input.nextDouble();

		}
		System.out.println("Your largest test score: "+ largest);
		System.out.println("Your smallest test score: "+ smallest);

	}

}

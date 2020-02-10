package loops07;

import java.util.Scanner;

public class ActivityRange {		//Integer.MIN_VALUE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Type an integer");
		int test = input.nextInt();
		int largest = test;
		int smallest = test;

		do{
		if(test >= largest)
		largest = test;
		if(test <= smallest)
		smallest = test;

		System.out.println("Type another integer (9999 to stop)");
		test = input.nextInt();

		}while (test != 9999);
		System.out.println("Your range of integers: "+ (largest-smallest));
	}

}

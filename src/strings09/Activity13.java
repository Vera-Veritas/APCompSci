package strings09;

import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your SS Number (no dashes)");
		String line = input.nextLine();
		System.out.println(line.substring(0, 3));
		System.out.println(line.substring(3, 5));
		System.out.println(line.substring(5, 9));


	}

}

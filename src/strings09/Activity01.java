package strings09;

import java.util.Scanner;

public class Activity01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// String bob = new String();
		System.out.println("Enter a sentence");
		String line = input.nextLine();

		System.out.println("First char: " + line.charAt(0));
		System.out.println("Third char: " + line.charAt(2));
		System.out.println("Full line: " + line);

		System.out.println(line.contains("Bob"));
	}

}

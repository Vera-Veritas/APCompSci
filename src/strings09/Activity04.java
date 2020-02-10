package strings09;

import java.util.Scanner;

public class Activity04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence");			//case sensitive
		String line = input.nextLine();
		System.out.println("First \"x\" to appear at: " + line.indexOf("x"));	//numbers work inside ""
		
	}

}

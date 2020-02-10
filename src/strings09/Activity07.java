package strings09;

import java.util.Scanner;

public class Activity07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence");		
		String line = input.nextLine();
		String lowLine = line.toLowerCase();
		System.out.println(lowLine);
	}

}

package outputExamples;

import java.util.Scanner;

public class SchoolID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first and last name");
		String nameFirst = input.next();
		String nameLast = input.next();
		String lowNameFirst = nameFirst.toLowerCase();
		String lowNameLast = nameLast.toLowerCase();

		System.out.println("Enter your school graduation year (example: 2021)");
		String year = input.next();
		int end = nameLast.length();
		if (end>5)
			end=5;
		System.out.println("Your school username: "+ year.substring(2, 4)+lowNameLast.substring(0, end)+lowNameFirst.charAt(0));

	}

}

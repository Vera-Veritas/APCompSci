package strings09;

import java.util.Scanner;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String line = input.nextLine();
		int counter;
		int lengthh;
		String letter;
		lengthh = line.length();
		for (counter = 0; counter < lengthh; counter++) {
			if (line.charAt(counter) != ' ' && line.charAt(counter) != 'a')	//use '' not ""
				System.out.println(line.charAt(counter));
		}

	}

}

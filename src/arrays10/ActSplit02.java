package arrays10;

import java.util.Scanner;

public class ActSplit02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type a sentence");
		String line = input.nextLine() + " ";
		String[] array = line.split(" ");
		System.out.println("Type a key word");
		String word = input.nextLine();
		int find = 0;
		int c;
		for (c = 0; c < array.length; c++) {
			if (array[c].contains(word)) // equalsIgnoreCase
				find++;
		}
		System.out.println("finds: " + find);
	}
}

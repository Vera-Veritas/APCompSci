package strings09;

import java.util.Scanner;

public class Activity06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence");			
		String line = input.nextLine();
		int counter;
		for(counter=0;counter<line.length();counter++){		//make sure not <=
		System.out.println(line.charAt(counter));
		}
	}

}

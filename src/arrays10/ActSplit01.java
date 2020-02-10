package arrays10;

import java.util.Scanner;

public class ActSplit01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type a sentence");
		String line = input.nextLine();
		String[] array = line.split(" ");
		int c;
		for(c=0;c<array.length;c++){
			System.out.println(array[c]);
		}
	}

}

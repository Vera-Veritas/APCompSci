package arrays10;

import java.util.Random;
import java.util.Scanner;

public class ActSplit03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Type a sentence");
		String line = input.nextLine()+" ";
		String[] array = line.split(" ");
		int c = rand.nextInt(array.length);
		System.out.println(array[c]);
	}

}

package loops07;

import java.util.Scanner;

public class Nest00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter;
		int c2;
		for (c2 = 1; c2 <= 5; c2++) {
			for (counter = 1; counter <= 10; counter++) {
				System.out.println(counter + " Hello World");
			}
			System.out.println("   done "+c2+" times\n");
		}
	}

}

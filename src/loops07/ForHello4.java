package loops07;

import java.util.Scanner;

public class ForHello4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		for (counter = 15; counter <= 60; counter+=5) {			//2 ways
			System.out.println(counter + " Hello World");
		}
		System.out.println();
		int counter2 = 0;
		for (counter2 = 3; counter2 <= 12; counter2++) {			//2 ways
			System.out.println((counter2*5) + " Hello World");
		}

	}

}

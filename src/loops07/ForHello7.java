package loops07;

import java.util.Scanner;

public class ForHello7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int counter = 0;
		System.out.println("What's your fav num?");
		int num = input.nextInt();
		for (counter = 1; counter <= 10; counter++) {			
			System.out.println(num + " Hello World");
		}
	}

}

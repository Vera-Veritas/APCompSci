package loops07;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type a positive integer");
		int integer = input.nextInt();
		int counter = 0;
		int total = 1;
		for(counter = 1; counter<=integer; counter++){
			total*=counter;
		}
		System.out.println("factorial: "+total);
	}

}

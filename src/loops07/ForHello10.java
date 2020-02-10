package loops07;

import java.util.Scanner;

public class ForHello10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int counter = 0;
		int sum = 0;
		System.out.println("What's your fav num?");
		int num = input.nextInt();
		for (counter = 1; counter<=50; counter++) {			
			sum = sum+(num*counter);
		}
		System.out.println(sum + " is the sum of the first 50 multiples of "+num);
		}			


}

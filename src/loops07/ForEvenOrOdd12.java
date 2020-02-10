package loops07;

import java.util.Scanner;

public class ForEvenOrOdd12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int num;
		for (counter = 1; counter <= 5; counter++) {
			System.out.println("Type a num");
			num = input.nextInt();
			if(num%2==1)
			System.out.println(num+" is odd");
			else
				System.out.println(num+" is even");
		}
		
	}

}

package loops07;

import java.util.Scanner;	//display largest num typed

public class Int9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num = 0;
		double biggest = Integer.MIN_VALUE;					// smallest value

		System.out.println("Type a number (9999 to quit)");
		num = input.nextDouble();
		
		while (Math.abs(num - 9999) > 0.01) {
			if(num>biggest){
				biggest = num;
			}
			System.out.println("Type a number (9999 to quit)");
			num = input.nextDouble();

		}
		System.out.println("9999: terminated");
		System.out.println(biggest);
	}

}

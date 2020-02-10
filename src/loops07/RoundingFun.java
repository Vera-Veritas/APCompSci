package loops07;

import java.util.Scanner;

public class RoundingFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num = 0000;
		System.out.println("Type a four digit integer");
		num = input.nextDouble();
		
		while (num != 9){
		num = (Math.round(num * 0.01)) * 100;
		System.out.println("Rounded to the nearest hundreds: "+ num);
		System.out.println("Type a four digit integer (9 to stop)");
		num = input.nextDouble();
		}
		System.out.println("terminated");
	}

}

package objectOrientedP05;

import java.util.Scanner;

public class paractivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num1 = 7.1;
		double num2 = 6.9;
		num1 = Math.pow(num1, 3);
		System.out.println("num1 cubed: " + num1);
		num2 = Math.floor(num2);
		System.out.println("num2 rounded down: " + num2);
		num1 = Math.ceil(Math.cbrt(num1));
		System.out.println("num1 rounded up: " + num1);

	}

}

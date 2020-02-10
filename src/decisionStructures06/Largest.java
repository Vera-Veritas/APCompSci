package decisionStructures06;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type 3 numbers in \nType Num 1:");
		int num1 = input.nextInt();
		System.out.println("Type Num 2:");
		int num2 = input.nextInt();
		System.out.println("Type Num 3:");
		int num3 = input.nextInt();
		
		if ((num1!=num2)&&(num2!=num3)){
		if ((num1>=num2)&&(num1>=num3))
			System.out.println(num1 + " is the largest number");
		if ((num2>=num1)&&(num2>=num3))
			System.out.println(num2 + " is the largest number");
		if ((num3>=num1)&&(num3>=num2))
			System.out.println(num3 + " is the largest number");
		}
		
		if ((num1==num2)&&(num2==num3))
			System.out.println(num1 + " is the largest number");
	}

}

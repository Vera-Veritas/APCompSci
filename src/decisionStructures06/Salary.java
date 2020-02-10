package decisionStructures06;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How much do you make a year?");
		double salary = input.nextDouble();
		
		if (salary < 20000)
			System.out.println("You are a: worker");
		if (salary >= 20000 && salary <= 100000)
			if (salary <= 40000)
			System.out.println("You are in: management");
			System.out.println("You are a: CEO");
		if (salary > 100000)
			System.out.println("You are an: owner");


	}

}

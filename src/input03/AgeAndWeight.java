package input03;

import java.util.Scanner;

public class AgeAndWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = -999;
		double weight = -999.0;
		System.out.println("What's the your age?");
		age = input.nextInt();
		System.out.println("What's the your weight?");
		weight = input.nextDouble();
		System.out.println("Shhhh your age is "+age+", and your weight is "+weight+". Don't tell!");
		//sout ctrl+space = System.out.println();
		}

}

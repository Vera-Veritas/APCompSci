package input03;

import java.util.Scanner;

public class Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height = -999.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What's the height of an adult monkey?");
		height = input.nextDouble();
		System.out.println("The hight of an adult monkey is " + height + ".");
	}

}

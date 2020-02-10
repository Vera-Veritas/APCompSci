package objectOrientedP05;

import java.util.Scanner;

//skipping the println
public class NumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		Number bob = new Number();
		bob.sayNumber(8);
		bob.sayNumberPlus2(78);
		bob.saySum(5, 7);
		bob.calcSum(4, 8);

		System.out.println("Type a number"); // returnSquare
		double number = input.nextDouble();
		double doubled = bob.returnSquare(number);
		System.out.println(number + " squared is " + doubled);
		System.out.println(bob.returnSquare(number));

		System.out.println("What is the length?"); // returnArea
		double lengtharea = input.nextDouble();
		System.out.println("What is the width?"); 
		double widtharea = input.nextDouble();
		double areart = bob.returnArea(lengtharea, widtharea);
		System.out.println("The area is " + areart);
		System.out.println(bob.returnArea(lengtharea, widtharea));

		System.out.println("Don't type an integer"); // returnRoundUp
		double round = input.nextDouble();
		System.out.println("Rounded up to " + bob.returnRoundUp(round));
	}

}

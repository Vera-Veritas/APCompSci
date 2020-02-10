package decisionStructures06;

import java.util.Scanner;

public class GradePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double avg;
		System.out.println("Type in 3 test scores (percent) \nType Test 1:");
		double num1 = input.nextDouble();
		System.out.println("Type Test 2:");
		double num2 = input.nextDouble();
		System.out.println("Type Test 3:");
		double num3 = input.nextDouble();
		avg = (num1 + num2 + num3)/3;

		System.out.println("Did you do the extra credit? (true/false)");
		boolean answ = input.nextBoolean();
		if (answ == true) {					//could of done 	if (choice == 'y')
			System.out.println("How many extra credit points?");
			double ec = input.nextDouble();
			avg = avg + ec;
		}
		
		System.out.println("Test avg= "+avg);
	}

}

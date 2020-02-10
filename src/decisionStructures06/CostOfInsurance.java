package decisionStructures06;

import java.util.Scanner;

public class CostOfInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();
		System.out.println("What is your weight?");
		double weight = input.nextDouble();
		System.out.println("Do you smoke? (0 or 1)");
		int smoke = input.nextInt();

		double baseCost = 200;
		if (age > 75)
			baseCost += 125;
		if (age < 30)
			baseCost -= 25;
		if (weight > 700)
			baseCost += 300;
		if (smoke == 0)
			baseCost -= 40;
		if (smoke == 1)
			baseCost += 50;

		System.out.println("Cost of Insurance: $" + baseCost);
	}

}

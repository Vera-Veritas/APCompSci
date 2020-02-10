package decisionStructures06;

import java.util.Scanner;

public class PetsAndGarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many pets do you have?");
		int pets = input.nextInt();
		System.out.println("How many cars do you have?");
		int cars = input.nextInt();
		
		int petCheck = 5;
		int carCheck = 3;
		System.out.println("You have at least 5 pets OR can fit more than 3 cars: "+ (pets>=petCheck||cars>carCheck));
	}

}

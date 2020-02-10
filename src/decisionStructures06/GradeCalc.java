package decisionStructures06;

import java.util.Scanner;

public class GradeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your test average?");
		double test = input.nextDouble();
		System.out.println("What is your homework average?");
		double hmwk = input.nextDouble();
		System.out.println("Is your teacher nice? (0 is no, 1 is yes)");
		int answ = input.nextInt();
		
		if (answ == 1){
			if(test < hmwk)
				System.out.println("Your grade is: " + hmwk);
			else
				System.out.println("Your grade is: " + test);
		}
		else{
			if(test < hmwk)
				System.out.println("Your grade is: " + test);
			else
				System.out.println("Your grade is: " + hmwk);
		}

	}

}

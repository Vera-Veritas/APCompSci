package input03;

import java.util.Scanner;

public class ProgramOppFortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int weight = -999;
		int age = -999;
		int lucky = -999;

		System.out.println("What's your weight?");
		weight = input.nextInt();
		System.out.println("What's your age?");
		age = input.nextInt();
		System.out.println("What's your lucky numbe?");
		lucky = input.nextInt();

		System.out.println("In the future...\nI see...");
		System.out.println(lucky + " years from now...\nYou will reside at number " + age + weight + " at the old folks home.");
	}

}

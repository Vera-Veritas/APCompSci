package outputExamples;

import java.util.Scanner;

public class TesterAnyChap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type your name");
		String name = input.next();
		System.out.println("Hello " + name + "!");
		
		input.nextLine();
		System.out.println("Do you want to go to Harvard?");
		String harv = input.next();
		//if (harv == "yes")				//doesn't work
		String yes = "yes";
		if(true==yes.equalsIgnoreCase(harv))
			System.out.println("cool");
		else
			System.out.println("hmmm");
		
		input.nextLine();
		System.out.println("Age?");
		int age = input.nextInt();
		System.out.println(name+" is "+age);
		
		input.nextLine();		//next by itself doesn't work
		System.out.println("Saying?");
		String saying = input.nextLine();
		System.out.println(name+" says "+saying);

		
		
	}

}

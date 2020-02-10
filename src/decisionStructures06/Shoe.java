package decisionStructures06;

import java.util.Scanner;

public class Shoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		int height = input.nextInt();
		System.out.println("What is your shoe size?");
		int shoe = input.nextInt();
		int check = 26;
		System.out.println("Your height + shoe size is less than 26:"+(check>=height+shoe));
		
		int heightcheck = 62;
		int shoecheck = 9;
		System.out.println("Is your height < 62 AND your shoe size > 9: "+ (heightcheck>height&&shoecheck<shoe));
	}

}

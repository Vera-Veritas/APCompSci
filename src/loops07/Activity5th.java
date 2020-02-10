package loops07;

import java.util.Scanner;

public class Activity5th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type an integer");
		int num = input.nextInt();
		do{
			System.out.println("to the 5th pow: " + Math.pow(num,5));
			System.out.println("Type an integer (9999 to stop)");
			num = input.nextInt();
		}
		while(num!=9999);
		System.out.print("terminated");
	}

}

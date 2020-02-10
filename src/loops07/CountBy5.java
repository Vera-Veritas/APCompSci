package loops07;

import java.util.Scanner;

public class CountBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.println("Type an integer");
		int limit = input.nextInt();

		while ((num+5) <= limit){
		num+=5;
		System.out.println(num);
		}

	}

}

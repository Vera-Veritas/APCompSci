package loops07;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.println("Type an integer (-1 to stop)");
		num = input.nextInt();

		while (num != -1){
		System.out.println(Math.pow(num,3));
		System.out.println("Type an integer (-1 to stop)");
		num = input.nextInt();

		}
		System.out.println("-1: terminated");
	}

}

package loops07;

import java.util.Scanner;

public class Int5 {	//double a num until you want to stop

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.println("Type an integer (9999 to quit)");
		num = input.nextInt();

		while (num != 9999){
		System.out.println(num*2);
		System.out.println("Type an integer (9999 to quit)");
		num = input.nextInt();

		}
		System.out.println("9999: terminated");
	}

}

package loops07;

import java.util.Scanner;

public class Activity17 {	//forces you to do it at least once, you can type 9999 first to calculate

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type an integer");
		int num = input.nextInt();
		int magic = 17;
		do{
			System.out.println("Magic product: "+(magic*num));
			System.out.println("Type an integer (9999 to stop)");
			num = input.nextInt();
		}
		while(num!=9999);
		System.out.println("terminated");

	}

}

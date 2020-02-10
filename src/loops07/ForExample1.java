package loops07;

import java.util.Scanner;

public class ForExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		for (counter = 1; counter <= 5; counter++) {
			System.out.println(counter);
		}
		System.out.println("2nd part");
		for (int count = 1; count <= 5; count++) {		//int dies at end
			System.out.println(count);
		}
	}

}

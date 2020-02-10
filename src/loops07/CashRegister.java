package loops07;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int total = 0;
		System.out.println("How many items?");
		int items = input.nextInt();
		for (counter = 1; counter <= items; counter++) {
			System.out.println("Price for item " + counter + "?");
			int cost = input.nextInt();
			total += cost;
		}
		System.out.println("total cost: " + total);
		System.out.println("cost of tax: " + (total*0.05));
		System.out.println("total cost with tax: " + (total*1.05));
	}

}

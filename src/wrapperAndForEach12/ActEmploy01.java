package wrapperAndForEach12;

import java.util.ArrayList;
import java.util.Scanner;

public class ActEmploy01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Double> wages = new ArrayList<Double>();
		System.out.println("How many Employees?");
		int ppl = input.nextInt();
		int c;
		for (c = 0; c < ppl; c++) {
			System.out.println("Enter employee wage:");
			wages.add(input.nextDouble());
		}
		double max = 0.0;
		for (double list : wages)
			if (max < list)
				max = list;
		System.out.println("Largest wage: $" + max);
	}

}

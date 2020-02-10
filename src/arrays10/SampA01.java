package arrays10;

import java.util.Scanner;

public class SampA01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many students?");
		int numP = input.nextInt();
		input.nextLine();
		String[][] ppl = new String[numP][2];
		int c;
		int totalLength = 0;
		String fullName;
		for (c = 0; c < numP; c++) {
			System.out.println("Name of a student? (ex: first last)");
			fullName = input.nextLine();
			ppl[c][0] = fullName.substring(0, fullName.indexOf(" "));
			ppl[c][1] = fullName.substring(fullName.indexOf(" ") + 1);
			totalLength += ppl[c][0].length();
		}
		System.out.println("The average length of the first names is: " + ((double) totalLength / numP));
		for (c = 0; c < numP; c++) {
			System.out.println(ppl[c][1] + ", " + ppl[c][0]);
		}

	}

}

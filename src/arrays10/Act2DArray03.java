package arrays10;

import java.util.Scanner;

public class Act2DArray03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[][] array = new String[4][3];
		int c;
		int c2;
		for (c = 0; c < array.length; c++) {
			for (c2 = 0; c2 < array[0].length; c2++) {
				System.out.println("Type in a name");
				array[c][c2] = input.nextLine();
			}
		}
		for (c = 0; c < array.length; c++) {
			for (c2 = 0; c2 < array[0].length; c2++) {
				System.out.print(array[c][c2] + " ");
			}
			System.out.println();
		}

	}
}
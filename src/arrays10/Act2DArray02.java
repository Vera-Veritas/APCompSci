package arrays10;

import java.util.Random;
import java.util.Scanner;

public class Act2DArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int[][] array = new int[3][7];
		int c;
		int c2;
		int rowT = 0;
		for (c = 0; c < array.length; c++) {
			rowT = 0;
			for (c2 = 0; c2 < array[0].length; c2++) {
				array[c][c2] = rand.nextInt(101);
				System.out.print(array[c][c2] + " ");
				rowT += array[c][c2];
			}
			System.out.print(" row total: " + rowT);
			System.out.println();
		}
		System.out.println(array[0][0]);
	}

}

package arrays10;

import java.util.Random;

public class Act2DArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();

		int[][] array = new int[14][9];
		int c;
		int c2;
		for (c = 0; c < 14; c++) {
			for (c2 = 0; c2 < 9; c2++) {
				array[c][c2] = rand.nextInt(101);
				System.out.print(array[c][c2]+" ");
			}
			System.out.println();
		}
		System.out.println(array[0][0]);

	}

}

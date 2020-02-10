package arrays10;

import java.util.Random;
import java.util.Scanner;

public class Act2DFriend01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		Friend[][] array = new Friend[18][5];
		int c;
		int c2;
		for (c = 0; c < array.length; c++) {
			for (c2 = 0; c2 < array[0].length; c2++) {
				array[c][c2] = new Friend();
				array[c][c2].setAge(rand.nextInt(101));
				System.out.print(array[c][c2].getAge() + " ");
			}
			System.out.println();
		}
	}

}

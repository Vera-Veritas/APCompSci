package arrays10;

import java.util.Scanner;

public class ObjAct04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] names = new String[20];
		int c;
		int maxi = 0;
		int max = 0;
		for (c = 0; c < names.length; c++) {
			System.out.println("Friend's name?");
			String friend = input.nextLine();
			names[c] = friend;
			if (friend.length() > maxi) {
				maxi = friend.length();
				max = c;
			}
		}
		String saver = names[19];
		names[19] = names[max];
		names[max] = saver;

		System.out.println("Names in order:");
		for (c = 0; c < names.length; c++) {
			System.out.println(names[c]);
		}
	}
}

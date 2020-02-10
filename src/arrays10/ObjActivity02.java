package arrays10;

import java.util.Scanner;

public class ObjActivity02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] names = new String[20];
		int c;
		for (c = 0; c < names.length; c++) {
			System.out.println("Friend's name?");
			String friend = input.nextLine();
			names[c] = friend;
		}
		int count = 0;
		System.out.println("Search a letter:");
		String answ = input.next();
		System.out.println("Friends that end in " + answ.charAt(0));
		for (c = 0; c < names.length; c++) {
			if (names[c].charAt(names[c].length() - 1) == answ.charAt(0)) {
				System.out.println(names[c]);
				count++;
			}
		}
		if (count == 0)
			System.out.println("0: You have no friends");
	}

}

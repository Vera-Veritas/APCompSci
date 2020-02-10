package arrays10;

import java.util.Scanner;

public class ObjAct03 {

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
		System.out.println("Search a name length:");
		int longname = input.nextInt();
		System.out.println("Friends that names are " + longname + " character long");
		for (c = 0; c < names.length; c++) {
			if (names[c].length() == longname) {
				System.out.println(names[c]);
				count++;
			}
		}
		if (count == 0)
			System.out.println("0: You have no friends");
	}

}

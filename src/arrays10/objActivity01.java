package arrays10;

import java.util.Scanner;

public class objActivity01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] names = new String[20];
		int c;
		for (c = 0; c < names.length; c++) {
			System.out.println("Friend's name?");
			String friend = input.nextLine();
			names[c]=friend;
		}
		System.out.println("Names in reverse order:");
		for (c=19;c>=0;c--){
			System.out.println(names[c]);
		}
	}

}

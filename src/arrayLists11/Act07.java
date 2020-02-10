package arrayLists11;

import java.util.ArrayList;
import java.util.Scanner;

public class Act07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		int c;
		for (c = 0; c < 5; c++) {
			System.out.println("Type in a Friend's name");
			names.add(input.nextLine());
		}
		System.out.println();
		for (c = 0; c < 5; c++) {
			System.out.println(names.get(c));
		}
		String one = names.remove(0);
		String two = names.remove(0);
		
		System.out.println("length of first name: "+one.length());
		System.out.println("length of second name: "+two.length());
	}

}

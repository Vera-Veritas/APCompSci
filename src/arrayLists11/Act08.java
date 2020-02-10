package arrayLists11;

import java.util.ArrayList;
import java.util.Scanner;

public class Act08 {

	public static void main(String[] args) {											
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		int c;
		for (c = 0; c < 5; c++) {
			System.out.println("Type in a Friend's name");
			names.add(input.nextLine());
		}
		String first = names.remove(0);
		names.set(2, first);
		String last = names.remove(names.size()-1);
		names.add(0, last);
		System.out.println();
		for (c = 0; c < names.size(); c++) {
			System.out.println(names.get(c));
		}

	}

}

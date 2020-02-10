package arrayLists11;

import java.util.ArrayList;
import java.util.Scanner;

public class methodsAct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		names.add("Bob");
		names.add("Jane");
		names.add(1, "Billy");
		System.out.println("what's your name?");
		names.add(input.next());
		for (int c = 0; c < names.size(); c++) {
			System.out.println(names.get(c));
		}
	}

}

package arrayLists11;

import java.util.ArrayList;
import java.util.Scanner;

public class Act04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> arrr = new ArrayList<String>();
		arrr.add("Bob Smith");
		arrr.add("Jane Miller");
		arrr.add(0, "Billy Jones");
		System.out.println("Add your name");
		arrr.add(input.nextLine());
		arrr.remove(1);
		for (int c = 0; c < arrr.size(); c++) {
			System.out.println(arrr.get(c));
		}
	}

}

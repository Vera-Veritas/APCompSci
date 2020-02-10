package wrapperAndForEach12;

import java.util.ArrayList;
import java.util.Scanner;

public class Act04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();

		int c;
		for (c = 0; c < 5; c++) {
			System.out.println("Type in a name");
			names.add(input.nextLine());
		}
		int length = Integer.MAX_VALUE;
		//int count = -1;
		String got = null;
		for (String list : names) {
			//count++;
			if (length > list.length()){
				length = list.length();
				 got = list;
		}
	}				System.out.println("Shortest name: " + got);}


}

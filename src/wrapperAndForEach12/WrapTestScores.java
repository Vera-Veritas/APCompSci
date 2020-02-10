package wrapperAndForEach12;

import java.util.ArrayList;
import java.util.Scanner;

public class WrapTestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> tests = new ArrayList<Integer>();
		System.out.println("How many students?");
		int stud = input.nextInt();
		int c;
		int lowest = Integer.MAX_VALUE;
		int highest = Integer.MIN_VALUE;
		int indexLowTest=-1;
		int indexHighTest=-1;
		for (c = 0; c < stud; c++) {
			System.out.println("Type in a student's test score");
			tests.add(input.nextInt());
		}
		for (c = 0; c < stud; c++) {

			if (tests.get(c) < lowest)
				indexLowTest = c;
			if (tests.get(c) > highest)
				indexHighTest = c;
		}
		int low = tests.remove(indexLowTest);
		for (c = 0; c < tests.size(); c++) {
			System.out.println(tests.get(c));
		}
		tests.add(0,low);
		System.out.println();
		int high = tests.remove(indexHighTest);
		for (c = 0; c < tests.size(); c++) {
			System.out.println(tests.get(c));
		}
		
		//tests.add(high);
		System.out.println("Test Scores:");
		for (c = 0; c < tests.size(); c++) {
			System.out.println(tests.get(c));
		}
	}

}

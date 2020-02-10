package wrapperAndForEach12;

import java.util.ArrayList;
import java.util.Scanner;

public class Act01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> names = new ArrayList<Integer>();
		System.out.println("How many students?");
		int stud = input.nextInt();
		int c;
		for (c = 0; c < stud; c++) {
			System.out.println("Type in a student's age");
			names.add(input.nextInt());
		}
		int sum =0;
		for(int y : names)
			sum+=y;
		
		System.out.println("Avg age: "+((double)sum/stud));
	}

}

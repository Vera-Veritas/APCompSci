package oneDimensionalArrays10;

import java.util.Scanner;

public class Activity01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] score = new int[5];
		int c;
		for (c = 0; c < 5; c++) {
			System.out.println("test score?");
			int value = input.nextInt();
			score[c]=value;
		}
		for (c=4;c>=0;c--){
			System.out.println(score[c]);
		}

	}

}

package MathOperators04;

import java.util.Scanner;

public class PostIts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int length = -999;
		int width = -999;
		int wallarea = -999;
		int postit = -999;

		System.out.println("What is the length of the wall in inches?");
		length = input.nextInt();
		System.out.println("What is the width of the wall in inches?");
		width = input.nextInt();

		wallarea = length * width;
		postit = wallarea / 9;

		System.out.println("You need this many Post-Its to cover your wall: " + postit);

	}

}

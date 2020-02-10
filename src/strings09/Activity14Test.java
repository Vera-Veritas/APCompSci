package strings09;

import java.util.Scanner;

public class Activity14Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Activity14 bob = new Activity14();
		System.out.println(bob.setText());
		System.out.println(bob.returnLast());
		bob.charactersFirst();
		System.out.println("does it have x: "+bob.containsX());
		bob.returnWords();
	}

}

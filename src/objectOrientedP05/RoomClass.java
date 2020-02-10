package objectOrientedP05;

import java.util.Scanner;

public class RoomClass {
	Scanner input = new Scanner(System.in);

	public RoomClass() {

	}

	public void area() {
		System.out.println("What is the length of the wall?");
		int length = input.nextInt();
		System.out.println("What is the height of the wall?");
		int height = input.nextInt();
		System.out.println("Area of wall: " + (length * height));
	}

	public void areaWithDoor() {
		System.out.println("What is the length of the wall?");
		int lengthw = input.nextInt();
		System.out.println("What is the height of the wall?");
		int heightw = input.nextInt();
		System.out.println("What is the length of the door?");
		int lengthd = input.nextInt();
		System.out.println("What is the height of the door?");
		int heightd = input.nextInt();
		System.out.println("Area of wall with door: " + ((lengthw * heightw) - (lengthd * heightd)));
	}
}

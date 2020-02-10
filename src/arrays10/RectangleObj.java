package arrays10;

import java.util.Random;
import java.util.Scanner;

public class RectangleObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random pup = new Random();
		Rectangle[] bob = new Rectangle[100];
		int c;
		for(c=0;c<bob.length;c++){
			bob[c]=new Rectangle(pup.nextInt(47)+10,pup.nextInt(47)+10);
			System.out.println("\nLength: "+bob[c].getLength());
			System.out.println("Width: "+bob[c].getWidth());
			System.out.println("Perimeter: "+bob[c].perimeter());
			System.out.println("Area: "+bob[c].area());
		}
		
	}

}

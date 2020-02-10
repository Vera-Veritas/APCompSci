package arrays10;

import java.util.Random;
import java.util.Scanner;

public class RectangleObj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random pup = new Random();
		Rectangle[] bob = new Rectangle[100];
		int c;
		int min=3600;
		int element=0;
		int saveL=0;
		int saveW=0;
		for (c = 0; c < bob.length; c++) {
			bob[c] = new Rectangle(pup.nextInt(47) + 10, pup.nextInt(47) + 10);
			if(bob[c].area()<min){
				min=bob[c].area();
				element=c;
				saveL=bob[c].getLength();
				saveW=bob[c].getWidth();
			}
		}
		bob[element]=bob[0];
		bob[0]=new Rectangle(saveL,saveW);
		for (c = 0; c < bob.length; c++) {
			System.out.println("\nArea: " + bob[c].area() + " (from " + bob[c].getLength() + "*" + bob[c].getWidth() + ")");
			if(c==element)
				System.out.println("*");
		}
	}

}

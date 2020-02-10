package designingClasses14;

import java.util.Random;

public class PileOJunk {
	Random cat = new Random();

	private static int idNum = 1;
	private int myID;
	private int num;

	public PileOJunk() {
		myID = idNum;
		idNum++;
		num = cat.nextInt(91) + 10;
	}

	public void displayInfo() {
		System.out.println("IDNum:" + myID);
		System.out.println("Amount: "+num);
	}

	public static int sum(int x, int y) {
		return x + y;
	}

	public void setRand(int num) {
		this.num = num;
	}

}

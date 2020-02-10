package designingClasses14;

import java.util.ArrayList;
import java.util.Scanner;

public class PileOJunkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How much junk?");
		int junk = input.nextInt();
		ArrayList<PileOJunk> joe = new ArrayList<PileOJunk>();
		for(int c =0;c<junk;c++){
			joe.add(new PileOJunk());
		}
		for(PileOJunk y: joe){
			y.displayInfo();
		}
		

	}

}

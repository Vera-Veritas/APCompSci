package wrapperAndForEach12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random cat = new Random();
		ArrayList<Integer> scores = new ArrayList<Integer>();
		int c;
		for(c=0;c<1000;c++){
			scores.add(cat.nextInt(1201)+400);
			
		}
		boolean inThere = false;
		System.out.println("Search for a SAT score");
		int search = input.nextInt();
		for(int x : scores)
			if(x==search){
				inThere = true;
				break;
			}
		System.out.println("Score found? "+inThere);
		System.out.println(scores.get(cat.nextInt(1000)));
	}

}

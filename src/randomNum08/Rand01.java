package randomNum08;

import java.util.Random;

public class Rand01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		int flips;
		int heads=0;
		int tails=0;
		int coin;
	
		for (flips = 1; flips <= 100000; flips++) {
			coin= bob.nextInt(2);
			if(coin==0)
				heads++;
			else
				tails++;
		}
		System.out.println("Out of "+(heads+tails)+" flips...");
		System.out.println("Heads:"+heads);
		System.out.println("Tails:"+tails);
	}

}

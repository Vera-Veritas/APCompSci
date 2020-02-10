package randomNum08;

import java.util.Random;

public class Rand02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		int rolls;
		int dice;
		int total=0;
		for (rolls = 1; rolls <= 87; rolls++) {
			dice= bob.nextInt(13)+1;
			if(dice%3==0)
				total++;
		}
		System.out.println(total+" multiples of 3 rolled");
	}

}

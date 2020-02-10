package randomNum08;

import java.util.Random;

public class Rand03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();

		int rand;
		int min = 26;
		int max = 43;
		int c;
		int count = 0;
		for (c = 1; c <= 248; c++) {
			rand = min + bob.nextInt(max - min + 1);
			if (rand > 36)
				count++;
		}
		System.out.println("First graders over 3 feet tall:" + count + " out of 248");
	}

}

package loops07;

import java.util.Scanner; 				//not done. output 123451 \n 23452 \n 3453 etc.

public class NumOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter;
		int c2;
		int num=0;
		for (c2 = 1; c2 <= 5; c2++) {
			for (counter = 1+num; counter <= 5; counter++) {
				System.out.println((counter)+" "+(c2));	
			}
			num++;
			//System.out.println("   done "+c2+" times\n");
		}
	}

}

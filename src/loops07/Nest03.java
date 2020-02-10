package loops07;

import java.util.Scanner;

public class Nest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int c2;
		int total = 0;
		int not = 0;
		int num = 1000;
		int big = 0;
		int fin = 999;
		for (c2 = 1; counter <= num; c2++) {
			total = 0;
			for (counter = 1; counter <= c2; counter++) {
				if (c2 % counter >= 1)
					not++;
				else

					total++;
			}
			if (total > big){
				big = total;
				fin = c2;}
		}
		System.out.println("Num with most factors: " + fin);

	}

}

package loops07;

import java.util.Scanner;

public class Int4 {	//display (sum of multiples of 2) until limit

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int start = 0;
		System.out.println("Type an interger");
		int num = input.nextInt();
		
		int total = 0;
		while (start< num){
			total += start;
			start+=2;
			
		}
		System.out.println(total);
	}

}

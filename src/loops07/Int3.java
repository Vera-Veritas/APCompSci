package loops07;

import java.util.Scanner;

public class Int3 { //display num+2 until limit

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int start = 0;
		System.out.println("Type an interger");
		int integer = input.nextInt();
		
		while (integer<=0){
			System.out.println("Type an interger");
			integer = input.nextInt();
		}
			
		while (start<= integer){
			System.out.println(start);
			start+=2;
		}
	}

}

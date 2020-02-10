package strings09;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		do{
		System.out.println("Enter a palindrome");
		String line = input.nextLine();
		
		boolean answ = false;
		int count;
		int count2 = 0;
		for(count=0;count<Math.floor((double)line.length()/2);count++){
			if(line.charAt(count)!=line.charAt(line.length()-count2-1)){
				answ = false;
				break;
			}
			else
				count2++;
				answ = true;
				
		}
		System.out.println("Was it a palindrome? " + answ);
		System.out.println("Do you want to keep looping? yes or no");
		}while(input.nextLine().equalsIgnoreCase("yes"));
	}

}

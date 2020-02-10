package strings09;

import java.util.Scanner;

public class NumOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		do{
		System.out.println("Enter a sentence");
		String line = input.nextLine();
		
		int words=0;
		int count;
		for(count=0;count<line.length();count++){
			if(line.charAt(count)==' '||line.charAt(count)=='-')
				words++;
		}
		words++;
		System.out.println("Number of words found: " + words);
		System.out.println("Do you want to keep looping? yes or no");
		}while(input.nextLine().equalsIgnoreCase("yes"));
	}
}

package strings09;

import java.util.Scanner;

public class NumOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String line = input.nextLine();
		int vow=0;
		int count;
		for(count=0;count<line.length();count++){
			if(line.charAt(count)=='a'||line.charAt(count)=='e'||
					line.charAt(count)=='i'||line.charAt(count)=='o'||
					line.charAt(count)=='u'||line.charAt(count)=='y')
				vow++;
		}
		System.out.println("Number of vowels found: " + vow);
	}

}

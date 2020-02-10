package decisionStructures06;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What's the MAGIC NUMBER?");
		int num = input.nextInt();
		int magicNum = 21;
		if (num == magicNum)
			System.out.println(("***THE MAGICC NUMBER HAS BEEN CHOOSEN***"));
		System.out.println("do you tempt the skies again?");
	}

}

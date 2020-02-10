package strings09;

import java.util.Scanner;

public class PasswordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Password beep = new Password();
		int okay = 0;
		int okay2 = 0;
		do {
			System.out.println("Enter a new password (LastName:Pass)");
			String nPass = input.nextLine();
			int colon = nPass.indexOf(":");
			String justP = nPass.substring(colon + 1);
			if (beep.setPass(justP) == true)
				okay++;
		} while (okay == 0);
		do {
			System.out.println("Validate Password");
			if(beep.match(input.nextLine())==true)
				okay2++;
		} while (okay2 == 0);
	}

}

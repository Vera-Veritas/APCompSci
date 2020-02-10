package strings09;

import java.util.Scanner;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String pass;
		String verify;
		boolean answ = false;
		do{
		System.out.println("Enter the PASSWORD");
		pass = input.next();
		System.out.println("Verify the PASSWORD");
		verify = input.next();
		answ = pass.equals(verify);
		}while(answ==false);
		System.out.println("Logged in!");

	}

}

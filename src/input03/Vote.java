package input03;
import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean answ = false;
Scanner input = new Scanner(System.in);
System.out.println("Did you vote? True or False?");
answ = input.nextBoolean();
System.out.println("Vote = "+answ);
	}

}

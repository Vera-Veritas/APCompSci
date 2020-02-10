package MathOperators04;
import java.util.Scanner;
public class TesterTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double num = 10;
System.out.println("Type a number");
num = (int)input.nextDouble();
System.out.println(num);
//how to prevent someone messing up typing in
//testing
int mod = 12%6;
System.out.println(mod);
	}

}

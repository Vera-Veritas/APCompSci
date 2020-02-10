package designingClasses14;

import java.util.ArrayList;
import java.util.Scanner;

public class GreeterTest {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter bob = new Greeter();	//static field example
		bob.displayInfo();
		System.out.println();
		bob = new Greeter("Sally Sam");
		bob.displayInfo();
		
		Scanner input = new Scanner(System.in);
		System.out.println("\nHow many people?");
		int ppl = input.nextInt();
		ArrayList<Greeter> joe = new ArrayList<Greeter>();
		for(int c =0;c<ppl;c++){
			joe.add(new Greeter());
		}
		for(Greeter y: joe){
			y.displayInfo();
		}

	}

}

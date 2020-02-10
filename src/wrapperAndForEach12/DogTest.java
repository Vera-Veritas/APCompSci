package wrapperAndForEach12;

import java.util.Scanner;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Dog test = new Dog();
		System.out.println("regular constuctor");
		System.out.println(test.getN());
		System.out.println(test.getS());
		System.out.println(test.getA());
		test.setN("Fluffy");
		test.setS(6);
		test.setA(5);
		System.out.println();
		System.out.println(test.getN());
		System.out.println(test.getS());
		System.out.println(test.getA());

		System.out.println();
		System.out.println("alt constuctor");
		Dog two = new Dog("Mr. Snug", 2,2);
		System.out.println(two.getN());
		System.out.println(two.getS());
		System.out.println(two.getA());
	}

}

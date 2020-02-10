package interfaces15;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Person khan = new Teacher();
		System.out.println("teacher name: " + khan.getName());
		System.out.println("teacher age: " + khan.getAge());
		khan = new Student();
		System.out.println("student name: " + khan.getName());
		System.out.println("student age: " + khan.getAge());

	}

}

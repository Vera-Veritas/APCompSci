package interfaces15;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonT3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		ArrayList<Person> list = new ArrayList<Person>();
		for(int c=0;c<3;c++){
		list.add(new Teacher());
		list.add(new Student());
		}
		for (Person names : list) {
			if (names.getName().length() > 10)
				System.out.println(names.getAge());
			else
				System.out.println();
		}
	}
}

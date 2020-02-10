package arrays10;

import java.util.Scanner;

public class FriendSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many friends do you have?");
		int numF = input.nextInt();
		Friend[] bubble = new Friend[numF];
		int c;
		for (c = 0; c < numF; c++) {
			System.out.println("Type in their first and last name (ex: first last)");
			String n = input.nextLine();
			input.nextLine();
			System.out.println("Type in their age");
			int a = input.nextInt();
			bubble[c] = new Friend(n, a);
		}
		input.nextLine();
		String again;
		int s;
		do {
			System.out.println("Search: (1)First Name, (2)Last Name, (3)Age");
			s = input.nextInt();
			if (s == 1) {
				System.out.println("Type in first name");
				String fname = input.next();
				for (c = 0; c < numF; c++) {
					if (bubble[c].getFirst(bubble[c].getName()).equalsIgnoreCase(fname))
						System.out.println("friend: "+bubble[c].getName()+bubble[c].getAge());
				}
			}
			if (s == 2) {
				System.out.println("Type in last name");
				String lname = input.next();
				for (c = 0; c < numF; c++) {
					if (bubble[c].getLast(bubble[c].getName()).equalsIgnoreCase(lname))
						System.out.println("friend: "+bubble[c].getName()+bubble[c].getAge());
				}
			}
			if (s == 3) {
				System.out.println("Type in age");
				int ages = input.nextInt();
				for (c = 0; c < numF; c++) {
					System.out.println(bubble[c].getAge());
					System.out.println(bubble[c].getName());
					if (bubble[c].getAge()==ages)
						System.out.println("friend: "+bubble[c].getName()+" "+bubble[c].getAge());
				}
			}
			System.out.println("Search again?");
			again = input.next();
		} while (again.equalsIgnoreCase("yes"));
	}

}

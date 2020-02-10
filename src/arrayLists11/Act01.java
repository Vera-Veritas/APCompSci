package arrayLists11;

import java.util.ArrayList;

import arrays10.Friend;

public class Act01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Friend> names = new ArrayList<Friend>();
		names.add(new Friend("Billy Bob", 12));
		names.add(0, new Friend("Jill Joe", 8));
		names.add(0, new Friend("Pete Poe", 7));
		for (int c = 0; c < names.size(); c++) {
			System.out.println(names.get(c).getName()+" "+names.get(c).getAge());
		}

	}

}

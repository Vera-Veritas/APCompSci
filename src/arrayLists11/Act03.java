package arrayLists11;

import java.util.ArrayList;

public class Act03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sarah");
		names.add("Billy");
		names.add("Anna");
		names.add("Chris");
		names.add("Julia");
		names.remove(0);
		names.remove(names.size() - 1);
		for (int c = 0; c < names.size(); c++) {
			System.out.println(names.get(c));
		}

	}

}

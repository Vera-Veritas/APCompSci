package interfaces15;

import java.util.ArrayList;

public class PTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> ppl = new ArrayList<Person>();
		for (int c = 0; c < 3; c++) {
			ppl.add(new Teacher());
			ppl.add(new Student());
		}

		for (Person y : ppl) {
			if(y instanceof Student)
				((Student) y).outSick();
			System.out.println(y.getName());
		}
	}

}

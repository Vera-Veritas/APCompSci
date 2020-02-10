package interfaces15;

import java.util.ArrayList;

public class PTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> list = new ArrayList<Person>();
		for(int c=0;c<3;c++){
		list.add(new Teacher());
		list.add(new Student());
		}
		for(Person y:list){
			if(y instanceof Teacher)
				((Teacher) y).payMe();
			if(y instanceof Student)
				System.out.println(y.getName());
		}
	}

}

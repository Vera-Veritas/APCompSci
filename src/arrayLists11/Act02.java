package arrayLists11;

import java.util.ArrayList;
import java.util.Random;

public class Act02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random cat = new Random();
		ArrayList<RectClass> boxes = new ArrayList <RectClass>();
		int c;
		for (c = 0; c < 5; c++) {
			boxes.add(new RectClass(cat.nextInt(20)+50, cat.nextInt(20)+50));
		}
		System.out.println("Rectangle areas:");
		for(c= boxes.size()-1;c>=0;c--){
			RectClass onebox = boxes.get(c);
			System.out.println(onebox.area(c));
		}

	}

}

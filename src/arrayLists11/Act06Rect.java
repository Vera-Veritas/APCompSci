package arrayLists11;

import java.util.ArrayList;
import java.util.Random;

public class Act06Rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<RectClass> boxes = new ArrayList<RectClass>();
		Random mana = new Random();
		int c;
		for (c = 0; c < 5; c++) {
			boxes.add(new RectClass(mana.nextInt(20) + 50, mana.nextInt(20) + 50));
		}
		for (c = boxes.size() - 1; c >= 0; c--) {
			RectClass onebox = boxes.get(c);
			System.out.println(onebox.area(c));
		}
		System.out.println();
		RectClass last = boxes.remove(boxes.size() - 1);
		boxes.set(0, last);
		for (c = boxes.size() - 1; c >= 0; c--) {
			RectClass onebox = boxes.get(c);
			System.out.println(onebox.area(c));
		}
	}

}

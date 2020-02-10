package arrayLists11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Act05Rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random mana = new Random();
		ArrayList<RectClass> boxes = new ArrayList<RectClass>();
		int c;
		for (c = 0; c < 5; c++) {
			boxes.add(new RectClass(mana.nextInt(20) + 50, mana.nextInt(20) + 50));
		}
		int x = mana.nextInt(boxes.size());
		RectClass gone = boxes.remove(x);
		System.out.println("Rectangle areas:");
		for (c = boxes.size() - 1; c >= 0; c--) {
			RectClass onebox = boxes.get(c);
			System.out.println(onebox.area(c));
		}
		System.out.println();
		System.out.println(gone.getLength()*gone.getWidth());
	}

}

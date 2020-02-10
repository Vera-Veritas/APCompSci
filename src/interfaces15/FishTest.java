package interfaces15;

import java.util.ArrayList;

public class FishTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Fish> tank = new ArrayList<Fish>();
		for (int c = 0; c < 5; c++) {
			tank.add(new Trout());
			tank.add(new Goldfish());
		}
		
	}

}

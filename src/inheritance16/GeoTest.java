package inheritance16;

import java.util.ArrayList;

public class GeoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Geo> b = new ArrayList<Geo>();
		int c;
		for (c = 0; c < 3; c++) {
			b.add(new Rectangle());
			b.add(new Trapezoid());
		}
		double min = 0;
		int index = -1;
		for (Geo y : b) {
			if (y.area() > min) {
				min = y.area();
				index = b.indexOf(y);
			}
		}
		if (b.get(index) instanceof Rectangle) {
			System.out.println("Type: Rectangle");
			System.out.println("area: " + b.get(index).area());
		} else {
			System.out.println("Type: Trapezoid");
			System.out.println("area: " + b.get(index).area());
		}
	}

}

package inheritance16;

import java.util.ArrayList;

public class EWMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> b = new ArrayList<Employee>();
		int c;
		double totPay = 0;
		for (c = 0; c < 3; c += 2) {
			b.add(new Worker());
			totPay += b.get(c).calculatePay(40);
			b.add(new Manager());
			totPay += b.get(c + 1).calculatePay(40);
		}
		for (Employee y : b) {
			if (y instanceof Worker)
				System.out.println(y.toString());
		}
		for (c = b.size() - 1; c >= 0; c--) {
			if (b.get(c) instanceof Manager) {
				b.remove(c);
				break;
			}
			for (Employee x : b) {
				if (x.getRate() > 20)
					System.out.println(x.toString());

			}

		}

	}
}

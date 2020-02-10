package interfaces15;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> b = new ArrayList<Animal>();
		for (int c = 0; c < 5; c++) {
			b.add(new Dog());
			b.add(new Cat("Snugg",2,false));	//doesn't work when true :(
		}
		System.out.println("1st display: ");
		System.out.println();
		for (Animal y : b) {
			y.act();
			System.out.println(y.toString());
		}
		for (Animal y : b) {
			if (y instanceof Dog)
				((Dog) y).vet();
		}
		for (Animal y : b) {

			for (int c = b.size() - 1; c > 0; c--)
				if (y instanceof Cat) {
					if (((Cat) y).returnFriendly() == false) {
						b.remove(y);
						break;
					}
				}
		}
		System.out.println("\n2nd display: ");
		System.out.println();
		for (Animal y : b) {
			System.out.println(y.toString());
		}

	}

}

package interfaces15;

import java.util.Random;

public class Dog implements Animal{
	private String name;
	private int age;
	private boolean injured;
	Random z = new Random();

	public Dog() {
		name = "Buddy";
		age = 2;
		injured = true;
	}

	public Dog(String xn, int xa, boolean xj) {
		name = xn;
		age = xa;
		injured = xj;
	}

	public void act() {
		injured = false;
		age += 7;
		int chance = z.nextInt(49) + 1;
		if (chance == 1)
			injured = true;

	}

	public String toString() {
		return "Dog: " + "\nname: " + name + "\nage: " + age + "\ninjured: " + injured;
	}

	public void vet() {
		injured = false;
	}
}

package interfaces15;

import java.util.Random;

public class Cat implements Animal{
	private String name;
	private int age;
	private boolean friendly;
	Random z = new Random();

	public Cat() {
		name = "Fluffy";
		age = 2;
		friendly = false;
	}

	public Cat(String xn, int xa, boolean xf) {
		name = xn;
		age = xa;
		friendly = xf;
	}

	public void act() {
		if(friendly==true)
		friendly = false;
		else
			friendly=true;
		age += 9;

	}

	public String toString() {
		return "Cat: " + "\nname: " + name + "\nage: " + age + "\nfriendly: " + friendly;
	}
	public boolean returnFriendly(){
		return friendly;
	}
}

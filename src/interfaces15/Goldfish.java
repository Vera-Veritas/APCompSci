package interfaces15;

public class Goldfish implements Fish{
	private double length;
	private int age;
	private String color;

	public Goldfish() {
		length = 12.8;
		age = 5;
		color = "Gold";
	}

	public Goldfish(double xl, int xa, String xc) {
		length = xl;
		age = xa;
		color = xc;
	}
	public double getLength(){
		return length;
	}
	public String toString() {
		return "Goldfish" + "\nlength: " + length + "\nage: " + age + "\ncolor: " + color;
	}
}

package interfaces15;

public class Trout implements Fish{
	private double length;
	private int age;
	private double numScales;

	public Trout() {
		length = 12.8;
		age = 5;
		numScales = 28;
	}

	public Trout(double xl, int xa, double xns) {
		length = xl;
		age = xa;
		numScales = xns;
	}
	public double getLength(){
		return length;
	}
	public String toString() {
		return "Trout" + "\nlength: " + length + "\nage: " + age + "\nnumScales: " + numScales;
	}
}

package inheritance16;

public class Quadrilateral {
	private double side1;
	private double side2;
	private double side3;
	private double side4;

	public Quadrilateral() {
		side1 = 2;
		side2 = 2;
		side3 = 2;
		side4 = 2;
	}

	public Quadrilateral(double one, double two, double tee, double four) {
		side1 = one;
		side2 = two;
		side3 = tee;
		side4 = four;
	}

	public double get1() {
		return side1;
	}

	public void set1(double xside) {
		side1 = xside;
	}

	public double get2() {
		return side2;
	}

	public void set2(double xside) {
		side2 = xside;
	}

	public double get3() {
		return side3;
	}

	public void set3(double xside) {
		side3 = xside;
	}

	public double get4() {
		return side4;
	}

	public void set4(double xside) {
		side4 = xside;
	}

	public double perimeter() {
		return side1 + side2 + side3 + side4;
	}

	public String toString(){
		return "(Quadrilateral) Side 1: "+side1+" Side 2: "+side2+" Side 3: "+side3+" Side 4: "+side4;
	}

}

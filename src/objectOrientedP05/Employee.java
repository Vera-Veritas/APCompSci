package objectOrientedP05;

public class Employee {

	private double wage;
	private int exp;

	public Employee() {
		wage = 10.5;
		exp = 1;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double xwage) {
		wage = xwage;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int experience) {
		exp = exp + experience;
	}

	public void raise() {
		wage = wage * 1.1;
		System.out.println("$" + wage);
	}
}

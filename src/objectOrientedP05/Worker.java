package objectOrientedP05;

public class Worker {
	private int hours;
	private double payRate;

	public Worker() {
		hours = 8;
		payRate = 11.5;
	}

	public Worker(int newHours, int newPayRate) {
		hours = newHours;
		payRate = newPayRate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int xHours) {
		hours = xHours;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double xPayRate) {
		payRate = xPayRate;
	}

	public double payCheck() {
		return hours * payRate;
	}

	public void raise(double amount) {
		payRate = payRate * amount;
	}

}

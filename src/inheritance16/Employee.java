package inheritance16;

public class Employee {
	private String name;
	private double rate;

	public Employee(){
        name="Bob Smith";
        rate=10.25;
    }

	public String getName() {
		return name;
	}

	public double getRate() {
		return rate;
	}

	public double calculatePay(double h) {
		return h * rate;
	}

	public String toString() {
		return "Employee; name: " + name + " rate: " + rate;
	}

	public boolean equals(Object otherObj) {
		return this.toString().equals(otherObj.toString());
	}

}

package decisionStructures06;

public class Car {
	private double mpg;
	private double capacity;
	private double fuel;
	private double odometer;

	// Constructors
	public Car() {
		mpg = 20;
		capacity = 20;
		fuel = 20;
		odometer = 0;
	}

	public Car(double newMPG, double newCapacity, double newFuel, double newOdometer) {
		if (newMPG <= 0)
			if (newMPG == 0)
				mpg = 20;
			else
				mpg = newMPG * -1;
		else
			mpg = newMPG;
		if (newCapacity <= 0)
			if (newCapacity == 0)
				capacity = 20;
			else
				capacity = newCapacity * -1;
		else
			capacity = newCapacity;
		if (newFuel <= 0)
			if (newFuel == 0)
				fuel = 20;
			else
				fuel = newFuel * -1;
		else
			fuel = newFuel;
		if (newOdometer <= 0)
			if (newOdometer == 0)
				odometer = 20;
			else
				odometer = newOdometer * -1;
		else
			odometer = newOdometer;
	}

	// Accessor Methods
	public double getMPG() {
		return mpg;
	}

	public double getCapacity() {
		return capacity;
	}

	public double getFuel() {
		return fuel;
	}

	public double getOdometer() {
		return odometer;
	}

	// Mutator Methods
	public void setMPG(double newMpg) {
		mpg = newMpg;
	}

	public void setCapacity(double newCapacity) {
		capacity = newCapacity;
	}

	public void setFuel(double newFuel) {
		fuel = newFuel;
	}

	public void setOdometer(double newOdometer) {
		odometer = newOdometer;
	}

	// additional Methods
	public void fillTank(double gallonsAdded) {
		fuel = fuel + gallonsAdded;
	}

	public void driveCar(double milesTraveled) {
		fuel = fuel - (milesTraveled / mpg);
		odometer = odometer + milesTraveled;
	}
}

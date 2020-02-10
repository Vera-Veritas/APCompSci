package designingClasses14;

public class Car {
	private double mpg;
	private double cap;
	private double fuel;
	private double odo;

	public Car() {
		mpg = 30;
		cap = 20;
		fuel = 20;
		odo = 0;
	}

	public double getMPG() {
		return mpg;
	}

	public double getFuelCap() {
		return cap;
	}

	public double getFuelInTank() {
		return fuel;
	}

	public double getOdometer() {
		return odo;
	}

	/**
	 * This method sets the MPG instance field to the value passed to the
	 * method.
	 * 
	 * @param –
	 *            xMPG – double – must be greater than zero
	 **/
	public void setMPG(double xMPG) {
		if (xMPG > 0)
			mpg = xMPG;
	}

	/**
	 * This method sets the fuel capacity instance field to the value passed to
	 * the method.
	 * 
	 * @param –
	 *            xGallons – double – must be greater than zero and greater than
	 *            the fuel in the car
	 **/
	public void setFuelCap(double xGallons) {
		if (xGallons > 0 && xGallons >= fuel)
			cap = xGallons;
	}

	/**
	 * This method sets the fuel instance field to the value passed to the
	 * method.
	 * 
	 * @param –
	 *            xGallons – double – must be greater than zero and <= the
	 *            capacity of the fuel tank
	 **/
	public void setFuelInTank(double xGallons) {
		if (xGallons > 0 && xGallons <= cap)
			fuel = xGallons;
	}

	/**
	 * This method sets the odometer instance field to the value passed to the
	 * method.
	 * 
	 * @param –
	 *            xMiles – double – must be >= zero
	 **/
	public void setOdometer(double xMiles) {
		if (xMiles >= 0)
			odo = xMiles;
	}

	/**
	 * This method puts as much gas in the car as possible.
	 **/
	public void fillTank() {
		fuel = cap;
	}

	/**
	 * This method adds fuel to the car.
	 * 
	 * @param –
	 *            xGallons – double – must be greater than zero and <= the
	 *            capacity of the fuel tank minus the current amount of fuel
	 **/
	public void fillTank(double xGallons) {
		if (xGallons > 0 && fuel + xGallons <= cap)
			fuel += xGallons;
	}

	/**
	 * This method drives the car a given distance.
	 * 
	 * @param –
	 *            xMiles – double – must be greater than zero and the car must
	 *            have enough gas to drive the given distance
	 **/
	public void drive(double xMiles) {
		if (xMiles > 0 && xMiles / mpg <= fuel) {
			odo += xMiles;
			fuel -= (xMiles / mpg);
		}
	}
}

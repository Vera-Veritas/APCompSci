package objectOrientedP05;

public class RoachPopulation {
	private double population;

	public RoachPopulation() {
		population = 0;
	}

	public RoachPopulation(double newPop) {
		population = newPop;
	}

	public double getPop() {
		return population;
	}

	public void setPop(double xPop) {
		population = xPop;
	}

	public double timeStep() {
		return 2 * population;
	}

	public void sprayRoaches() {
		population = population * .9;
	}
}

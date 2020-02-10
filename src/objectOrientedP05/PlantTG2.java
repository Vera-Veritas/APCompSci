package objectOrientedP05;

public class PlantTG2 {
	public PlantTG2() {

	}

	public double plantGard(double length, double row) {
		double plantLength = length * row;
		double time = 2 * Math.ceil(plantLength / 15);
		return time;
	}
}

package objectOrientedP05;
import java.util.Scanner;
public class PlantTheGarden {

	public PlantTheGarden() {

	}

	public void plantGarden() {
		Scanner input = new Scanner(System.in);
		int width = 10;
		System.out.println("What is the length of the garden in feet?");
		int length = input.nextInt();
		System.out.println("How many rows in the garden?");
		int row = input.nextInt();
		double plantLength = length * row;
		double time = 2 * Math.ceil(plantLength / 15);
		System.out.println("Hours needed to plant garden: " + time);
	}
}

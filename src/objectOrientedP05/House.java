package objectOrientedP05;

import java.util.Scanner;

public class House {
	Scanner input = new Scanner(System.in);

	public House() {
		// this is the constructor (ex: public House)
	}

	public void paintAWall() {
		System.out.println("What is the length of the wall?");
		int length = input.nextInt();
		System.out.println("What is the height of the wall?");
		int height = input.nextInt();
		int area = length * height;
		int hours = area / 200;
		double mins = ((area % 200) * 60 / 200);
		System.out.println("Minutes to take to paint the wall: " + ((hours * 60) + mins));

	}

	public double paintWall2(double length, double height) {
		double area = length * height;
		double hours = area / 200;
		double time = ((area % 200) * 60 / 200);
		return time;
	}

	public double fillPool(double radius, double depth) {
		double volume = depth * Math.PI * Math.pow(radius, 2);
		double timep = volume;
		return timep;
	}

	public void fillTheSandbox() {
		System.out.println("Length in feet?");
		int lengths1 = input.nextInt();
		System.out.println("Width in feet?");
		int widths1 = input.nextInt();
		System.out.println("Depth in feet?");
		int depths1 = input.nextInt();
		System.out.println("Volume of sand in feet that you can transport per hour?");
		int sands1 = input.nextInt();
		int times1 = (int)Math.ceil((lengths1 * widths1 * depths1) / sands1);
		System.out.println("Hours needed to fill sandbox: " + times1);
	}
	public double fillTheSandbox2(double lengths2, double widths2, double depths2, double sands2) {
		double times2 = Math.ceil((lengths2 * widths2 * depths2) / sands2);
		return times2;
	}
}

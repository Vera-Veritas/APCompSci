package objectOrientedP05;

import java.util.Scanner;

public class HouseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		House bob = new House();
		bob.paintAWall();

		System.out.println("Part 2!");
		System.out.println("What is the length of the wall?");
		double length = input.nextInt();
		System.out.println("What is the height of the wall?");
		double height = input.nextInt();
		double time = bob.paintWall2(length, height);
		System.out.println(time);

		System.out.println("Fill Pool!");
		System.out.println("What is the radius of the pool in feet?");
		double radius = input.nextInt();
		System.out.println("What is the depth of the pool in feet?");
		double depth = input.nextInt();
		double timep = bob.fillPool(radius, depth);
		System.out.println(timep);

		bob.fillTheSandbox();

		System.out.println("Fill Sandbox 2\n");
		System.out.println("Length in feet?");
		double lengths2 = input.nextInt();
		System.out.println("Width in feet?");
		double widths2 = input.nextInt();
		System.out.println("Depth in feet?");
		double depths2 = input.nextInt();
		System.out.println("Volume of sand in feet that you can transport per hour?");
		double sands2 = input.nextInt();
		double times2 = bob.fillTheSandbox2(lengths2, widths2, depths2, sands2);
		System.out.println(times2);
	}

}

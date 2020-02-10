package objectOrientedP05;

import java.util.Scanner;

public class Number {
	Scanner input = new Scanner(System.in);

	public Number() {

	}

	public void sayNumber(double cat) {
		System.out.println(cat);
	}

	public void sayNumberPlus2(double val) {
		System.out.println(val + 2);
	}

	public void saySum(double shiro, double mistuki) {
		System.out.println(shiro + mistuki);
	}

	public double calcSum(double shiba, double sora) {
		double sum = shiba + sora;
		return sum;
	}

	public double returnSquare(double number) {
		double doubled = Math.pow(number, 2);
		return doubled;
	}

	public double returnArea(double lengtharea, double widtharea) {
		double areart = lengtharea * widtharea;
		return areart;
	}

	public double returnRoundUp(double round) {
		return Math.ceil(round);
	}
}

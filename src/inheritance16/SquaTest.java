package inheritance16;

public class SquaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square box = new Square(8);
		System.out.println("perimeter: " + box.perimeter());
		System.out.println("area: " + box.area());
		System.out.println();
		box = new Square();
		System.out.println("perimeter: " + box.perimeter());
		System.out.println("area: " + box.area());
	}

}

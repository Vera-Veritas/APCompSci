package inheritance16;

public class RectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle box = new Rectangle(10, 20);
		System.out.println("perimeter: " + box.perimeter());
		System.out.println("area: " + box.area());
		System.out.println();
		box = new Rectangle();
		System.out.println("perimeter: " + box.perimeter());
		System.out.println("area: " + box.area());
	}

}

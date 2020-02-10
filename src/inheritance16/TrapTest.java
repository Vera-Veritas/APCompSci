package inheritance16;

public class TrapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trapezoid box = new Trapezoid(4,3,5,6,10);
		System.out.println("perimeter: "+box.perimeter());
		System.out.println("area: "+box.area());
		System.out.println();
		box = new Trapezoid();
		System.out.println("perimeter: " + box.perimeter());
		System.out.println("area: " + box.area());
	}

}

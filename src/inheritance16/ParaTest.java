package inheritance16;

public class ParaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parallelogram box = new Parallelogram(4,3,5);
		System.out.println("perimeter: "+box.perimeter());
		System.out.println("area: "+box.area());
		System.out.println();
		box = new Parallelogram();
		System.out.println("perimeter: " + box.perimeter());
		System.out.println("area: " + box.area());
	}

}

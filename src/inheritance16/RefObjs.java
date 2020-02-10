package inheritance16;

public class RefObjs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square();
		Rectangle rect = sq;
		Parallelogram para = sq;
		Quadrilateral quad = sq;
		Object o = sq;
	}

}

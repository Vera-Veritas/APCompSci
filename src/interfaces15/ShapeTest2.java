package interfaces15;
import java.util.ArrayList;
public class ShapeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Shape> list = new ArrayList<Shape>();
		list.add(new Rectangle(3,4));
		list.add(new Rectangle(5,2));
		list.add(new Rectangle(1,8));
		list.add(new Circle(5));
		list.add(new Circle(2));
		list.add(new Circle(4));
		
		double tSum = 0;
		double minP=Integer.MAX_VALUE;
		for(Shape y: list){
				minP=y.perimeter();
		}
		
		System.out.println("total area of all shapes: "+tSum);
		System.out.println("smallest perimeter: "+minP);
		
	}

}

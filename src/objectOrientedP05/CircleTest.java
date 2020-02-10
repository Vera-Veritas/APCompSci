package objectOrientedP05; //alt class

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle pavo = new Circle();
System.out.println("radius: "+pavo.getRadius());
System.out.println("circumference: "+pavo.circumference());
System.out.println("area: "+pavo.area());
pavo.setRadius(3.4);
System.out.println("radius: "+pavo.getRadius());

pavo = new Circle(2.8);
System.out.println("\nradius: "+pavo.getRadius());
System.out.println("circumference: "+pavo.circumference());
System.out.println("area: "+pavo.area());
pavo.setRadius(3.4);
System.out.println("radius: "+pavo.getRadius());
	}

}

package inheritance16;

public class Parallelogram extends Quadrilateral{
	private double height;

	public Parallelogram(){
	super();
	height=4;
}
	public Parallelogram(double s1, double s2, double xh){
		super(s1,s2,s1,s2);
		height=xh;
	}
	public double area() {
		return super.get1() * height;
	}
	public String toString(){
		return "(Parallelogram)"+super.toString()+" height: "+height;
	}
}

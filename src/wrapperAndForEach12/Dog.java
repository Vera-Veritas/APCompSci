package wrapperAndForEach12;

public class Dog {
	private String name;
	private int siblings;
	private int age;

	public Dog() {
		name = "Buddy";
		siblings = 3;
		age = 7;

	}

	public Dog(String xname, int xsib, int xage) {
		name = xname;
		siblings = xsib;
		age = xage;
	}

	public void setN(String newN) {
		name = newN;
	}

	public String getN() {
		return name;
	}

	public void setS(int newS) {
		siblings = newS;
	}

	public int getS() {
		return siblings;
	}

	public void setA(int newA) {
		age = newA;
	}

	public int getA() {
		return age;
	}
}

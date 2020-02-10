package designingClasses14;

public class Greeter {
	private static int idNum = 1;
	private String name;
	private int myID;

	public Greeter() {
		myID = idNum;
		idNum++;
		name = "Bob Smith";
	}

	public Greeter(String myName) {
		name = myName;
		myID = idNum;
		idNum++;
	}

	public void displayInfo() {
		System.out.println(name);
		System.out.println("IDNum:" + myID);
	}
}

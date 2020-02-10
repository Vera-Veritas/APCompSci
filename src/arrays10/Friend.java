package arrays10;

public class Friend {
	private String name;
	private int age;
	private String first;
	private String last;

	public Friend() {
		name = "";
		age = 0;
	}

	public Friend(String n, int a) {
		name = n;
		age = a;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String n) {
		name = n;
	}

	public void setAge(int a) {
		age = a;
	}
	//new methods
	public String getFirst(String n){
		first = n.substring(0, n.indexOf(' '));
		return first;
	}
	public String getLast(String n){
		last = n.substring(n.indexOf(' ')+1);
		return last;
	}
	
}

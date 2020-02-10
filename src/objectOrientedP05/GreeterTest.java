package objectOrientedP05;

public class GreeterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter bob = new Greeter();	
		bob.sayHello();
		
		System.out.println(bob.getAge());
		bob.setAge(3);
		System.out.println(bob.getAge());

	}

}

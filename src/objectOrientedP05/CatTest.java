package objectOrientedP05;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat fluffy = new Cat();
		System.out.println("Age: " + fluffy.getAge());
		System.out.println("Hours slept: " + fluffy.getSleep());
		fluffy.birthday();
		System.out.println("Age: " + fluffy.getAge());
		fluffy.sleepMore();
		System.out.println("Hours slept: " + fluffy.getSleep());
		fluffy.sleepLess();
		fluffy.sleepLess();
		System.out.println("Hours slept: " + fluffy.getSleep());

	}

}

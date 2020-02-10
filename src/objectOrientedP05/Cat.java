package objectOrientedP05;

public class Cat {
	private int age;
	private int sleep;

	public Cat() {
		age = 2;
		sleep = 10;
	}

	public Cat(int newAge, int newSleep) {
		age = newAge;
		sleep = newSleep;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int xAge) {
		age = xAge;
	}

	public int getSleep() {
		return sleep;
	}

	public void setSleep(int xSleep) {
		sleep = xSleep;
	}

	public void birthday() {
		age++;
		// System.out.println(“Happy Birthday!”);	doesn't work
	}

	public void sleepMore() {
		sleep++;
	}

	public void sleepLess() {
		sleep--;
	}

}

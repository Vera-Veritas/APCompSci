package decisionStructures06;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car sara = new Car();
		System.out.println("MPG: " + sara.getMPG());
		System.out.println("Capacity: " + sara.getCapacity());
		System.out.println("Fuel: " + sara.getFuel());
		System.out.println("Odometer: " + sara.getOdometer());

		sara.setMPG(60);
		sara.setCapacity(60);
		sara.setFuel(30);
		sara.setOdometer(20);

		System.out.println("\nMPG: " + sara.getMPG());
		System.out.println("Capacity: " + sara.getCapacity());
		System.out.println("Fuel: " + sara.getFuel());
		System.out.println("Odometer: " + sara.getOdometer());

		sara.fillTank(10);
		System.out.println("\nFuel after tank filled: " + sara.getFuel());

		sara.driveCar(30);
		System.out.println("Fuel after drive: " + sara.getFuel());
		System.out.println("Odometer after drive: " + sara.getOdometer());

		sara = new Car(40, 60, 10, 0);
		System.out.println("MPG: " + sara.getMPG());
		System.out.println("Capacity: " + sara.getCapacity());
		System.out.println("Fuel: " + sara.getFuel());
		System.out.println("Odometer: " + sara.getOdometer());

		System.out.println("\nMPG: " + sara.getMPG());
		System.out.println("Capacity: " + sara.getCapacity());
		System.out.println("Fuel: " + sara.getFuel());
		System.out.println("Odometer: " + sara.getOdometer());

		sara.fillTank(10);
		System.out.println("\nFuel after tank filled: " + sara.getFuel());

		sara.driveCar(30);
		System.out.println("Fuel after drive: " + sara.getFuel());
		System.out.println("Odometer after drive: " + sara.getOdometer());
	}

}

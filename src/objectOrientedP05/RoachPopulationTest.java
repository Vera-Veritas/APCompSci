package objectOrientedP05;

public class RoachPopulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoachPopulation evanIsARoach = new RoachPopulation();
		System.out.println("Roach Population:"+evanIsARoach.getPop());
		evanIsARoach.setPop(10000);
		System.out.println("Roach Population:"+evanIsARoach.getPop());
		evanIsARoach.timeStep();
		System.out.println("Roach Population:"+evanIsARoach.getPop());
		evanIsARoach.sprayRoaches();
		System.out.println("Roach Population:"+evanIsARoach.getPop());

		evanIsARoach = new RoachPopulation(100);
		System.out.println("\nRoach Population:"+evanIsARoach.getPop());
		evanIsARoach.setPop(20000);
		System.out.println("Roach Population:"+evanIsARoach.getPop());
		evanIsARoach.timeStep();
		System.out.println("Roach Population:"+evanIsARoach.getPop());
		evanIsARoach.sprayRoaches();
		System.out.println("Roach Population:"+evanIsARoach.getPop());
	}

}

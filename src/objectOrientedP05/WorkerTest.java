package objectOrientedP05;

public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker sneha = new Worker();
		System.out.println("Hours: " + sneha.getHours());
		System.out.println("Rate: " + sneha.getPayRate());
		System.out.println("Paycheck: " + sneha.payCheck());
		sneha.raise(1.5);
		System.out.println("New rate: " + sneha.getPayRate());

		sneha = new Worker(9, 10);
		System.out.println("\nHours: " + sneha.getHours());
		System.out.println("Rate: " + sneha.getPayRate());
		System.out.println("Paycheck: " + sneha.payCheck());
		sneha.raise(1.5);
		System.out.println("New rate: " + sneha.getPayRate());

	}

}

package objectOrientedP05;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee sneha = new Employee();
		System.out.println("$" + sneha.getWage());
		sneha.setWage(15.5);
		System.out.println("$" + sneha.getWage());

		System.out.println("Lv " + sneha.getExp());
		sneha.setExp(10);
		System.out.println("Lv " + sneha.getExp());

		sneha.raise();
	}

}

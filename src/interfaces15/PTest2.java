package interfaces15;

public class PTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher();
		Student s = new Student();
		t.setName("Bob");
		t.payMe();
		s.setName("Sally");
		for (int c = 0; c < 3; c++) {
			s.outSick();
		}
		Person khan = t;
		System.out.println("teacher name: " + khan.getName());
		System.out.println("teacher age: " + khan.getAge());
		System.out.println("bank: "+t.getBalance());		//can't do these since not in interface
		khan = s;
		System.out.println("student name: " + khan.getName());
		System.out.println("student age: " + khan.getAge());
		System.out.println("absent: "+s.getAabsent());		//
	}

}

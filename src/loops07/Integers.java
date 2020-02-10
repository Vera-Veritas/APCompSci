package loops07;

public class Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0; 											// GET

		while (num <= 100) { 			/* or (num < 101) */
			// TEST
			System.out.println(num); 							// USE
			num++; 						/* or num += 1; */ 		// GET

		}
		System.out.println("normal termination"); 				// USE

		int num2 = 0;
		while (num2 <= 10000) {
			System.out.println(num2); 
			num2+=2;
		}

	}

}

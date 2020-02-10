package designingClasses14;

public class BankAccount {
	private static int account = 100;
	private int myAccount;
	// other fields

	BankAccount() {
		myAccount = account;
		account += 10;
		// finish the initialization of the state of the object
	}
	// rest of the class
}

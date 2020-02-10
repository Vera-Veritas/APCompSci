package objectOrientedP05;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount evan = new BankAccount();
		System.out.println("Balance:"+evan.getBalance());
		System.out.println("Account Number:"+evan.getAccNum());
		System.out.println("Interest:"+evan.getIntRate());
		evan.deposit(5.75);
		System.out.println("Balance:"+evan.getBalance());
		evan.withdraw(8.25);
		System.out.println("Balance:"+evan.getBalance());
		evan.addInterest();
		evan.financeCharge(1.25);
		System.out.println("Balance:"+evan.getBalance());

		evan = new BankAccount(100,654321,.5);
		System.out.println("\nBalance:"+evan.getBalance());
		System.out.println("Account Number:"+evan.getAccNum());
		System.out.println("Interest:"+evan.getIntRate());
		evan.deposit(5.75);
		System.out.println("Balance:"+evan.getBalance());
		evan.withdraw(8.25);
		System.out.println("Balance:"+evan.getBalance());
		evan.addInterest();
		evan.financeCharge(1.25);
		System.out.println("Balance:"+evan.getBalance());
		
	}

}

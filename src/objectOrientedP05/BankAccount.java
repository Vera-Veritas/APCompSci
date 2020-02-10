package objectOrientedP05;

public class BankAccount {
	private double balance;
	private int accountNum;
	private double interestRate;

	public BankAccount() {
		balance = 10;
		accountNum = 123456;
		interestRate = 0.03;
	}
	public BankAccount(double newBalance, int newAccNum, double newIntRate) {
		balance = newBalance;
		accountNum = newAccNum;
		interestRate = newIntRate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double xBal) {
		balance = xBal;
	}
	public int getAccNum() {
		return accountNum;
	}
	public void setAccNum(int xAccNum) {
		accountNum = xAccNum;
	}
	public double getIntRate() {
		return interestRate;
	}
	public void setIntRate(double xIntRate) {
		interestRate = xIntRate;
	}
	public void deposit(double dep) {
		balance = balance + dep;
	}
	public void withdraw(double wth) {
		balance = balance + wth;
	}
	public void addInterest() {
		balance = interestRate * balance + balance;
	}
	public void financeCharge(double charge) {
		balance = balance - charge;
	}

}

package hw5;

public class Account implements Withdrawable,
Depositable,
Balanceable {

	private double balance;
	private int transactions = 0;

	public int getTrans() {
		return this.transactions;
	}

	//Getter methoid for double "balance"
	@Override
	public double getBalance() {
		return this.balance;
	}

	//Setter method for double "balance"
	@Override
	public void setBalance(double amount) {
		this.balance = amount;
	}

	//Takes money from a specified double "amount"
	@Override
	public boolean withdraw(double amount) {
		double check = this.balance - amount;

		if (check > 0) {
			this.balance = check;
			this.transactions++;
			return true;
		}

		return false;
	}

	//Deposit into an account
	@Override
	public void deposit(double amount) {
		this.transactions++;
		this.balance += amount;
	}

}

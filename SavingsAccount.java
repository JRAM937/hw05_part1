package hw5;

public class SavingsAccount extends Account {
	private double interestRate; //Monthly intetest rate
	private double interestPayment; //Last monthly payment

	//constructor using superclass
	public SavingsAccount() {
		super();
		this.interestRate = 0.0;
		this.interestPayment = 0.0;
	}

	//constructor using parameters
	public SavingsAccount(double balance, double rate) {
		super();
		this.setBalance(balance);
		this.interestRate = rate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestPayment() {
		return interestPayment;
	}

	public void setInterestPayment(double interestPayment) {
		this.interestPayment = interestPayment;
	}

	public double calcInterest() {
		double payment = interestRate * this.getBalance();
		this.setInterestPayment(payment);
		this.setBalance(this.getBalance() + payment);
		return this.interestPayment;
	}

}

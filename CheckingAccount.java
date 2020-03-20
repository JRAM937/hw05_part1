package hw5;

public class CheckingAccount extends Account {

	private double fee;

	//Constructor using Superclass
	public CheckingAccount() {
		super();
	}

	//constructor using "fee" as a parameter
	public CheckingAccount(double amount, double fee) {
		super();
		this.setBalance(amount);
		this.fee = fee;
	}

	//Getter method for "fee"
	public double getFee() {
		return fee;
	}

	//Setter method for "fee"
	public void setFee(double amount) {
		this.fee = amount;
	}

	//Uses the local Acount object. Subtracts fee from this.balance. Returns double "fee"
	public double applyFee() {
		double totalFee = 0.0;

		for (int i = 0; i <= this.getTrans(); i++) {
			totalFee += fee;
		}

		this.setBalance((this.getBalance() - totalFee));
		return totalFee;
	}

}

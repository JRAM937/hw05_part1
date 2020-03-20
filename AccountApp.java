package hw5;
import java.util.Scanner;

public class AccountApp extends Account {
	static Scanner input = new Scanner(System. in );

	public static void main(int args[]) {

		Account checking = new CheckingAccount();
		Account saving = new SavingsAccount();

		System.out.println("Welcome to the Account App!");

		//Step 1 - Input the checking amount
		System.out.print("Enter initial checking amount: ");
		double userin = input.nextDouble();
		checking.setBalance(userin);
		System.out.println();

		//Step 2 - Input the saving amount
		System.out.print("Enter initial saving amount: ");
		userin = input.nextDouble();
		saving.setBalance(userin);
		System.out.println();

		//Step 3 - Input fee for checking account
		System.out.print("Enter checking fee: ");
		userin = input.nextDouble();
		((CheckingAccount) checking).setFee(userin);
		System.out.println();

		//Step 4 - Input interest for Saving account
		System.out.print("Enter Saving interest: ");
		userin = input.nextDouble();
		((SavingsAccount) saving).setInterestRate(userin);
		System.out.println();

		//Step 5 - Print all inputted information
		System.out.println("OK! This is your informaiton");
		System.out.println("Checking Amount: $" + checking.getBalance());
		System.out.print("Savings Amount: $" + saving.getBalance());
		System.out.println("Interest Rate: " + ((CheckingAccount) saving).getFee() + "%");

		//Step 6 - Begin asking for transactions
		System.out.println("Enter the transactions for the month");
		boolean inputting = true;
		while (inputting) {
			System.out.print("Withdrawl or Deposit? (w/d): ");
			String w_or_d = input.nextLine();
			System.out.println();
			System.out.print("Checking or Savings? (c/s): ");
			String c_or_s = input.nextLine();
			System.out.println();
			System.out.print("Amount?: ");
			double amount = input.nextDouble();

			if (w_or_d.equals("w")) {
				if (c_or_s.equals("c")) {
					checking.withdraw(amount);
				} else if (c_or_s.equals("s")) {
					saving.withdraw(amount);
				}

			} else if (w_or_d.equals("d")) {
				if (c_or_s.equals("c")) {
					checking.deposit(amount);
				} else if (c_or_s.equals("s")) {
					saving.deposit(amount);
				}

			}

			System.out.print("Continue? (y/n):");
			String cont = input.nextLine();
			if (cont.equals("y")) {
				inputting = true;
			} else if (cont.equals("n")) {
				inputting = false;
			}
		}

		//Final step - Print everything out
		System.out.println("Monthly Payments and Fees");
		System.out.println("Checking fee: $" + ((CheckingAccount) checking).getFee());
		System.out.println("Savings interest payment: $" + ((CheckingAccount) checking).applyFee());
		System.out.println("Final Balances");
		System.out.println("Checking: $" + checking.getBalance());
		System.out.println("Savings: $" + saving.getBalance());
	}
}

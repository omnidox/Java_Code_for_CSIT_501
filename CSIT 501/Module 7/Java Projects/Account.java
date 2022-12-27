package module_7_HW;

//********************************************************************
//Account.java Author: Lewis/Loftus
//
//Represents a bank account with basic services such as deposit
//and withdraw.
//********************************************************************
import java.text.NumberFormat;

public class Account {
	private final double RATE = 0.035; // interest rate of 3.5%
	private long acctNumber;
	private double balance;
	private String name;

//-----------------------------------------------------------------
// Sets up the account by defining its owner, account number,
// and initial balance.
//-----------------------------------------------------------------
	public Account(String owner, long account, double initial) {
		name = owner;
		acctNumber = account;
		balance = initial;
	}
	
	//-----------------------------------------------------------------
	// overload constructor: Sets up the account by defining its owner and account number.
	// and if no initial balance is inputed, it is assumes that the balance is 0.
	//-----------------------------------------------------------------
	public Account(String owner, long account) {
		name = owner;
		acctNumber = account;
		balance = 0;
	}

//-----------------------------------------------------------------
// Deposits the specified amount into the account. Returns the
// new balance.
//-----------------------------------------------------------------
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

//-----------------------------------------------------------------
// Withdraws the specified amount from the account and applies
// the fee. Returns the new balance.
//-----------------------------------------------------------------
	public double withdraw(double amount, double fee) {
		balance = balance - amount - fee;
		return balance;
	}

//-----------------------------------------------------------------
// Adds interest to the account and returns the new balance.
//-----------------------------------------------------------------
	public double addInterest() {
		balance += (balance * RATE);
		return balance;
	}

//-----------------------------------------------------------------
// Returns the current balance of the account.
//-----------------------------------------------------------------
	public double getBalance() {
		return balance;
	}

//-----------------------------------------------------------------
//Withdraw money from another account
//-----------------------------------------------------------------
	public double withdrawFrom(Account acct, double amount, double fee) {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		if (acct.getBalance() < amount) {
			System.out.println();
			System.out.println(acct.name + ", Which is the person you are withdrawing from, is too poor. " + acct.name
					+ "\'s balance is: " + fmt.format(acct.getBalance()));
			return balance;
		} else {
			acct.withdraw(amount, fee);
			balance = balance + amount - fee;
			return balance;
		}
	}

//-----------------------------------------------------------------
// Returns a one-line description of the account as a string.
//-----------------------------------------------------------------
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return acctNumber + "\t" + name + "\t" + fmt.format(balance);
	}
}
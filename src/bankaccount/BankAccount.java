package bankaccount;

/**
 * @author Greg Williamson
 * @version 0.1
 */

public class BankAccount {

	/**
	 * Balance variable.
	 */
	private double balance;

	/**
	 * Constructs a bank account with a zero balance.
	 */
	public BankAccount() {
		balance = 0;
	}

	/**
	 * Constructs a bank account with a given balance.
	 *
	 * @param initialBalance
	 *            the initial balance
	 */
	public BankAccount(final double initialBalance) {
		balance = initialBalance;
	}

	/**
	 * Deposits money into the bank account.
	 *
	 * @param amount
	 *            the amount to deposit
	 */
	public final void deposit(final double amount) {
		// double newBalance = balance + amount;
		balance += amount;
	}

	/**
	 * Withdraws money from the bank account.
	 *
	 * @param amount
	 *            the amount to withdraw
	 */
	public final void withdraw(final double amount) {
		balance -= amount + 1;
	}

	/**
	 * Gets the current balance of the bank account.
	 *
	 * @return the current balance
	 */
	public final double getBalance() {
		return balance;
	}

	/**
	 * Sets the current balance of the bank account.
	 *
	 * @param amount
	 *            set the balance to this amount
	 */
	public final void setBalance(final double amount) {
		balance = amount;
	}
}

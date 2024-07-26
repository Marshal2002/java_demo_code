package codes;

/* Write a Java program to create a class called "Bank" with a collection of accounts and methods
to add and remove accounts, and to deposit and withdrawAlso define a class called "Account" to
maintain account details of a particular customer. */
import java.util.*;

public class Bank {
	String name;
	String account_number;
	Double balance;

	public Bank(String name, String account_number, double balance) {
		this.name = name;
		this.account_number = account_number;
		this.balance = balance;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return account_number;
	}

	public void setAccountNumber(String account_number) {
		this.account_number = account_number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

//methods for bank functions like deposit and withdraw....
	public void deposit(double amount) {
		balance += amount;
	}

	void withdraw(double amount) {
		balance = balance - amount;
	}

	public String accountInfo() {
		return "Name -" + name + ", Account Number -" + account_number + ", Balance-" + balance;
	}

	public static void main(String[] args) {
		account bank = new account();

		Bank Account1 = new Bank("Albrin", "ac001", 27000);
		Bank Account2 = new Bank("cyrus", "ac002", 21000);
		Bank Account3 = new Bank("sakthi", "ac003", 58000);

		System.out.println("Bank Account Detais :");
		System.out.println("\n" + Account1.accountInfo());
		System.out.println(Account2.accountInfo());
		System.out.println(Account3.accountInfo());
		System.out.println("\nAfter deposit 1200 in Acount1 ");
		bank.depositMoney(Account1, 1200);
		System.out.println(Account1.accountInfo());
		System.out.println("No transaction in Account2 ");
		System.out.println(Account2.accountInfo());
		System.out.println("After withdrawing 18000 in Account3 ");
		bank.withdrawMoney(Account3, 18000);
		System.out.println(Account3.accountInfo());
	}
}

class account {
	public ArrayList<Bank> Accounts;

	public account() {
		Accounts = new ArrayList<Bank>();
	}

	public void addAccounts(Bank Ac) {
		Accounts.add(Ac);
	}

	public void removeAccounts(Bank Ac) {
		Accounts.remove(Ac);
	}

	public void withdrawMoney(Bank Ac, double amount) {
		Ac.withdraw(amount);
	}

	public void depositMoney(Bank Ac, double amount) {
		Ac.deposit(amount);
	}

	public ArrayList<Bank> getBankAccounts() {
		return Accounts;
	}
}

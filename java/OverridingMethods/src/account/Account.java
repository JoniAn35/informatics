package account;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private Date dateCreated = new Date();

	private static double yearInterestRate = 7.3;
	
	public static double getRate() {
		return yearInterestRate;
	}
	
//	public static void setRate(double rate) {
//		yearInterestRate = rate;
//	}
	
//	public static double getMonthlyInterestRate () {
//		return yearInterestRate/12;
//	}

	public Account() {
	}
	
	public Account(int id, double balance) {
		this.setID(id);
		this.balance = balance;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
//	public double getMonthlyInterest () {
//		return (yearInterestRate/12) * balance;
//	}
	
	public void withdraw(double out) {
		this.balance -= out;
	}
	
	public void deposit(double in) {
		this.balance += in;
	}
	
	public String toString() {
		return "ID: " + id + "\nBalance: " + balance + "\nAnnual interest rate: " + yearInterestRate;
	}
}

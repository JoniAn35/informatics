package uti;

public class ATM {
	private account[] idAccount = new account[10];
	
	public ATM() {
		for (int i = 0; i < 10; i++) {
			idAccount[i] = new account();
			idAccount[i].setID(i + 1); 
		}
	}

	public double getBalance(int i) {
		return idAccount[i].getBalance();
	}

	public void withdraw(int i, double n) {
		idAccount[i].withdraw(n);
	}
	
	public void deposit(int i, double m) {
		idAccount[i].deposit(m);
	}
}

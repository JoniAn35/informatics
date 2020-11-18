package uti;

public class testAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account account1 = new account(1122, 20_000);
		account1.setRate(4.5);
		
		account1.withdraw(2500);
		account1.deposit(3000);
		
		System.out.println(account1.getBalance() + "		" + account1.getMonthlyInterest() + "		" + account1.getDateCreated());
	}

}

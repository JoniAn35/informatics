package uti;

public class accountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		savingsAccount yoniSave = new savingsAccount();
		yoniSave.name = "Yoni";
		yoniSave.balance = 1000;
		
		yoniSave.deposit(50.98);
		yoniSave.withdrawl(300);
	}

}

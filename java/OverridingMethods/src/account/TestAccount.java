package account;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account();
		CheckAccount check = new CheckAccount(72816, 130.46, 300);
		SaveAccount save = new SaveAccount(9473);
		
		System.out.println(ac.toString() + "\n\n" + check.toString() + "\n\n" + save.toString());
	}

}

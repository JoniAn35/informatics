package account;

public class CheckAccount extends Account{
	private double limit;
	
	public CheckAccount(int id, double balance, double limit) {
		super(id, balance);
		this.limit = limit;
	}
	
	public String toString() {
		return super.toString() + "\nLimit; " + limit;
	}
}

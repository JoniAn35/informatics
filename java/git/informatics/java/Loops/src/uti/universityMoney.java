package uti;

public class universityMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double moneyIn10Years = 10000;
		for (int i = 0; i < 10; i++) {
			moneyIn10Years *= 106/100;
		}
		
		double moneyEducation = moneyIn10Years;
		for (int k = 0; k < 4; k ++) {
			moneyEducation += moneyEducation*6/100;
		}
		
		System.out.println("You have to pay " + (int)(moneyEducation * 100) / 100.0
				+ " $");
	}

}

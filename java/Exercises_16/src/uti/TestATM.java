package uti;

import java.util.Scanner;

public class TestATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		Scanner sc = new Scanner(System.in);
		int idNumber = 0, choice = 0; 
		double whitdraw, deposit;
		
		while (true) {
			System.out.println("Enter an id: ");
			idNumber = sc.nextInt();
			
			if (idNumber < 1 || idNumber > 10) {
				System.out.println("Invalid id.");
				continue;
			}
			
			while (true) {
				System.out.println("Main menu\n" + "1: check balance\n" + "2: withdraw\n" + "3: deposit\n" + "4: exit");
				
				System.out.println("Enter a choice: ");
				choice = sc.nextInt();
				
				switch (choice) {
					case 1: 
						System.out.println(atm.getBalance(idNumber - 1));
						break;
					case 2: 
						System.out.println("Enter an amount to withdraw: ");
						whitdraw = sc.nextInt();
						atm.withdraw(idNumber - 1, whitdraw);
						break;
					case 3:
						System.out.println("Enter an amount to deposit: ");
						deposit = sc.nextInt();
						atm.deposit(idNumber - 1, deposit);
						break;
					default:
						break;
				}
				
				if(choice == 4) {
					break;
				}
			}
				
		}

	}

}

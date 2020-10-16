package uti;

import java.util.Random;

/*
 * 1. �������
 * 		-> ��� � 7 ��� 11 - �������		=> ���������� ���������
 * 		-> ��� � 2, 3 ��� 12 - �����	=> ���������� ���������
 * 		-> ��� � ���� �������� - ������� ���
 * 
 * 2. ��� ���������� �� � ���������� 
 * 		-> �������� ��������� �� ����������
 * 		-> ������� ��� � ��� ������ �� ������� ����� ����
 * 		-> ��� ������� 7 - �����
 */

public class Craps {
	public static int randomNumberOfDice() {
		Random rand = new Random();
		
		int randomNumber = rand.nextInt(6);
		return randomNumber;
	}
	public static void print(int x, int y) {
		System.out.println("You rolled " + x + " + " + y + " = " + sumOfDice(x, y));
	}
	
	public static int sumOfDice(int x, int y) {
		int sumDice = x + y;
		return sumDice;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice1 = randomNumberOfDice() + 1;
		int dice2 = randomNumberOfDice() + 1;
		
		print(dice1, dice2);
		
		if (sumOfDice(dice1, dice2) == 7 || sumOfDice(dice1, dice2) == 11) {
			System.out.println("You win!");
		}
		else if (sumOfDice(dice1, dice2) == 2 || sumOfDice(dice1, dice2)== 3 
				|| sumOfDice(dice1, dice2) == 12) {
			System.out.println("You lose!");
		}
		else {
			int sum = sumOfDice(dice1, dice2);
			while (true) {
				dice1 = randomNumberOfDice();
				dice2 = randomNumberOfDice();
				print(dice1, dice2);
				
				if (sumOfDice(dice1, dice2) == 7){
					System.out.println("You lose!");
					break;
				}
				else if(sumOfDice(dice1, dice2) == sum) {
					System.out.println("You win!");
					break;
				}
			}
		}
	}

}

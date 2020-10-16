package uti;

import java.util.Random;

/*
 * 1. хвърляш
 * 		-> ако е 7 или 11 - печелиш		=> програмата приключва
 * 		-> ако е 2, 3 или 12 - губиш	=> програмата приключва
 * 		-> ако е нещо различно - хвърляш пак
 * 
 * 2. ако програмата не е приключила 
 * 		-> записваш резултата от хвърлянето
 * 		-> хвърляш пак и пак докато не изкараш същия сбор
 * 		-> ако хвърлиш 7 - губиш
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

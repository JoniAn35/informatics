package src.uti;

import java.util.Random;

public class deckOfCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] clubs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "D", "K", "A"};
		String[] diamonds = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "D", "K", "A"};
		String[] hearts = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "D", "K", "A"};
		String[] spades = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "D", "K", "A"};
		Random rand = new Random();
		
		int suit, number, i = 0;
		suit = rand.nextInt(4);
		
		do {
			switch (suit) {
				case 0:
					number = rand.nextInt(13);
					while (clubs[number] == "") {
						number = rand.nextInt(13);
					}
					System.out.println(clubs[number] + " of clubs");
					clubs[number] = "";
					break;
					
				case 1: 
					number = rand.nextInt(13);
					while (diamonds[number] == "") {
						number = rand.nextInt(13);
					}
					System.out.println(diamonds[number] + " of diamonds");
					diamonds[number] = "";
					break;
					
				case 2: 
					number = rand.nextInt(13);
					while (hearts[number] == "") {
						number = rand.nextInt(13);
					}
					System.out.println(hearts[number] + " of hearts");
					hearts[number] = "";
					break;
					
				case 3: 
					number = rand.nextInt(13);
					while (spades[number] == "") {
						number = rand.nextInt(13);
					}
					System.out.println(spades[number] + " of spades");
					spades[number] = "";
					break;
					
			}
			suit = rand.nextInt(4);
			i++;
		} while (i < 4);
	}

}

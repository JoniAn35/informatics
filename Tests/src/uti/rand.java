package uti;

import java.util.Random;
import java.util.Scanner;

public class rand {

	public static void main(String[] args) {
		final int max = 34;
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print(rand.nextInt(max) + 1);
			sc.nextLine();
		}

	}

}

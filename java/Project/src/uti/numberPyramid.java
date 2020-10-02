package uti;

import java.util.Scanner;

public class numberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number from 1 to 15:");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), numCopy;
		
		while (0 < num) {
			numCopy = num;
			for (int i = 0; i < num  && numCopy != 1; i ++) {
				System.out.print(numCopy);
				numCopy--;
			}
			//numCopy = 1;
			for (int i = 0; i < num; i ++) {
				System.out.print(numCopy);
				numCopy++;
			}
			num--;
			System.out.println();
		}
	}

}

package uti;

import java.util.Scanner;

public class numberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number from 1 to 15:");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), numCopy = num;
		
//		for (int k = 0; k < num; k ++) {
//			for (int i = 0; i < k; i ++) {
//				System.out.print(numCopy - i + 1);
//			}
//			System.out.println();
//			numCopy--;
//		}
		
		for (int k = 0; k < num; k ++) {
			numCopy = num;
			for (int i = 0; i < num - k; i ++) {
				System.out.print(numCopy);
				numCopy--;
			}
			numCopy = 1;
			for (int i = 0; i < num - k; i ++) {
				System.out.print(numCopy);
				numCopy++;
			}
			num--;
			System.out.println();
		}
	}

}

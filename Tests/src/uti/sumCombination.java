package uti;

import java.util.Scanner;

public class sumCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int size = 5;
		int[] nums = new int[size];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + size + " numbers:");
		for (int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}
		
		int sum;
		System.out.println("Enter a sum:");
		sum = sc.nextInt();
		for (int i = 0; i < size - 1; i++) {
			for (int k = i + 1; k < size; k++) {
				if (nums[i] + nums[k] == sum) {
					System.out.println("One combination is " + nums[i] + " and " + nums[k]);
				}
			}
		}
	}

}

package uti;

import java.util.Random;

import java.util.Scanner;

public class onePositionBackwards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[10];
		int randomIndex;
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			nums[i] = sc.nextInt();
		}
		
		int x = nums[0];
		for(int i = 1; i < 10; i++) {
			nums[i - 1] = nums[i];
		}
		nums[9] = x;
		
		for (int i = 0; i < 10; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}

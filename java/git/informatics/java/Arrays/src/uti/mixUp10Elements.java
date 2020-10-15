package uti;

import java.util.Random;
import java.util.Scanner;

public class mixUp10Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[10];
		int x;
		int randomIndex;
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			nums[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			randomIndex = rand.nextInt(10);
			x = nums[randomIndex];
			nums[randomIndex] = nums[i];
			nums[i] = x;
		}
		
		for (int randomNums: nums) {
			System.out.print(randomNums + "  ");
		}
	}

}

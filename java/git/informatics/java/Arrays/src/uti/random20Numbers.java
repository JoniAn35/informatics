package uti;

import java.util.Random;

public class random20Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[20];
		Random rand = new Random();
		
		for (int i = 0; i < 20; i++) {
			nums[i] = rand.nextInt(1000);
			System.out.print(nums[i] + "  ");
		}
	}

}

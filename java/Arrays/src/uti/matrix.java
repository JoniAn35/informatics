package uti;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][] nums = new int[5][5];
		int  sumRows = 0, sumMax = 0;
		
		for (int x = 0; x < 5; x++) {
			for (int y = 0; y < 5; y++) {
				nums[x][y] = sc.nextInt();
				sumRows += nums[x][y];
			}
			
			if(sumRows > sumMax) {
				sumMax = sumRows;
			}
			sumRows = 0;
		}
		
		System.out.println(sumMax);
	}

}

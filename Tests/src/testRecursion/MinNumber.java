package testRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MinNumber {

	public static void main(String[] args) {
		final int number = 5;
		Scanner sc = new Scanner(System.in);
		int[] list = new int[number];
		
		for(int i = 0; i < number; i++) {
			list[i] = sc.nextInt();
		}
		
		System.out.println(min(list, list[0], number));
		
	}

	public static int min(int[] arr, int result, int size) {
		if (size == 1) {
			return result;
		}
		else {
			if (arr[size - 1] < result) {
				result = arr[size - 1];
			}
			return min(arr, result, size - 1);
		}
//		else {
//			return min(arr, result, size - 1);
//		}
	}
}

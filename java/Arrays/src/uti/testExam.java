package uti;

import java.util.Scanner;

public class testExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [students][10] 
		 * [10] -> answers
		 * [students] -> points
		 */

		Scanner sc = new Scanner(System.in);
		
		final int students = 8;
		char[] key = new char[10];
		char[][] testAnswers = new char[students][10];
		int[] results = new int[students];
		
		System.out.println("Enter the key of the test:");
		for (int i = 0; i < 10; i++) {
			key[i] = sc.next().charAt(0);
		}
		
		System.out.println("Now enter the answers of " + students + " students:");
		for (int student = 0; student < students; student++) {
			for (int answer = 0; answer < 10; answer++) {
				testAnswers[student][answer] = sc.next().charAt(0);
			}
		}
		
		for (int student = 0; student < students; student++) {
			for (int answer = 0; answer < 10; answer++) {
				if(testAnswers[student][answer] == key[answer]) {
					results[student]++;
				}
			}
			System.out.println("Student " + (student + 1) + " has " + results[student] + " points.");
		}
	}

}
//D B D C C D A E A D
//
//A B A C C D E E A D
//D B A B C A E E A D
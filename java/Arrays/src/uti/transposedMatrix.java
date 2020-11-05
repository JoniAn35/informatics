package uti;

import java.util.Scanner;

public class transposedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the matrix:");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int[][] matrix = new int[rows][columns];
		int[][] tMatrix = new int[columns][rows];

		System.out.println("Now enter the matrix:");
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
//				System.out.println(row + " -> " + column);
				matrix[row][column] = sc.nextInt();
			}
		}
		
		for (int row = 0; row < columns; row++) {
			for (int column = 0; column < rows; column++) {
				tMatrix[row][column] = matrix[column][row];
			}
		}
		
		
//		System.out.println("###");
		System.out.println("The transposed matrix is:");
		for (int row = 0; row < columns; row++) {
			for (int column = 0; column < rows; column++) {
				// System.out.println("[" + k + "," + i + "]");
				System.out.print(tMatrix[row][column]);
			}
			System.out.println();
		}
		
		sc.close();
	}

}

package uti;

import java.util.Scanner;

public class paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double lenght = sc.nextDouble();
		double width = sc.nextDouble();
		
		double squareMeters = height * lenght * 2 + height * width * 2
				+ width * lenght;
		
		double bucket1L = 0, bucket5L = 0;
		bucket5L = Math.ceil(squareMeters / 140);
		bucket1L = Math.ceil(squareMeters / 30);
		
		if(bucket5L * 15 > bucket1L * 4){
			System.out.println("You need " + (int)bucket1L + " 1-liter bucket/s");
		}
		else {
			System.out.println("You need " + (int)bucket5L + " 5-liter bucket/s");
		}
	}

}

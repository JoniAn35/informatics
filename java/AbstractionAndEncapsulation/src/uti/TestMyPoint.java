package uti;

import java.util.Scanner;

public class TestMyPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MyPoint point1 = new MyPoint();
		
		System.out.println("Enter a specified coordinates: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		MyPoint point2 = new MyPoint(x, y);
		
		System.out.println("The distance between the default point (0,0) and your point is: " 
				+ ((int)(MyPoint.distance(point1, point2)*100))/100.0);
		
		System.out.println("Now enter another point coordinates: ");
		x = sc.nextInt();
		y = sc.nextInt();
		MyPoint point3 = new MyPoint(x, y);
		
		System.out.println("The distance between the default point (0,0) and your coordinates is: " 
				+ ((int)(point1.distance(x, y)*100))/100.0);
		
		System.out.println("The distance between the default point and your point is: " 
				+ ((int)(point1.distance(point3)*100))/100.0);
		
		sc.close();
	}

}

package uti;

import java.util.Scanner;

/***
 * Class for calculating wave spectrum
 * @author yoanaangelova
 *
 */
public class ColorRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a color code");
		
		double lenght = sc.nextDouble();
		
		if (lenght >= 380 && lenght < 450) {
			System.out.println("Violet");
		}
		else if(lenght >= 450 && lenght < 495) {
			System.out.println("Blue");
		}
		else if(lenght >= 495 && lenght < 570) {
			System.out.println("Green");
		}
		else if(lenght >= 570 && lenght < 590) {
			System.out.println("Yellow");
		}
		else if (lenght >= 590 && lenght < 620) {
			System.out.println("Orange");
		}
		else if (lenght >= 620 && lenght < 750) {
			System.out.println("Red");
		}
		else {
			System.out.println("The entered wavelength is not a part of the visible spectrum");
		}
	}

}

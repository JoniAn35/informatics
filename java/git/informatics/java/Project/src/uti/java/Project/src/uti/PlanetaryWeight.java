package uti;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PlanetaryWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int weight = Integer.parseInt(JOptionPane.showInputDialog("Enter your weight"));
		
		String[] planets = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn"
				, "Uranus", "Neptune"};
		String input = (String)JOptionPane.showInputDialog(null, "Choose a planet",
				"Planetary Weight", 2, null, planets, planets[0]);
		
		switch(input) {
			case "Mercury": 
				weight *= 0.38;
				break;
			case "Venus":
				weight *= 0.91;
				break;
			case "Mars":
				weight *= 0.38;
				break;
			case "Jupiter":
				weight *= 2.36;
				break;
			case "Saturn":
				weight *= 0.92;
				break;
			case "Uranus":
				weight *= 0.89;
				break;
			case "Neptune":
				weight *= 1.13;
				break;
		}
		
		System.out.println("Your weight on " + input + " is " + weight);
	}

}

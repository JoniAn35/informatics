package uti;

public class testCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle circle1 = new circle();
		System.out.println("The aria of the circle of radius " + circle1.radius + 
				" is " + circle1.getArea());
		
		circle circle2 = new circle(25);
		System.out.println("The aria of the circle of radius " + circle2.radius + 
				" is " + circle2.getArea());
		
		circle circle3 = new circle(25);
		System.out.println("The aria of the circle of radius " + circle3.radius + 
				" is " + circle3.getArea());
		
		circle2.radius = 100; // or circle2.setRadius(100);
		System.out.println("The aria of the circle of radius " + circle2.radius + 
				" is " + circle2.getArea());
	}

}

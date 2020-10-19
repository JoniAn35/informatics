package uti;

public class circle {
	double radius = 1;
	
	public circle() {
		
	}
	
	public circle(double newRadius) {
		radius = newRadius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
}

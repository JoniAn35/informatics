package uti;

public class Circle extends GeometricObject{
	private double radius = 1;
	
	public Circle() {
		this.objectType = "Circle";
	}
	
	public Circle (double radius) {
		this.setRadius(radius);
		this.objectType = "Circle";
	}
	
	public Circle (double radius, String color, boolean filled) {
		this.setRadius(radius);
		setColor(color);
		setFilled(filled);
		this.objectType = "Circle";
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	public double getDiameter() {
		return this.radius * 2;
	}
	
	public double getPerimeter() {
		return getDiameter() * Math.PI;
	}
	
	public void printCircle() {
		System.out.println("The circle is created " +  getDateCreated() + " and the radius is " + getRadius());
	}
}

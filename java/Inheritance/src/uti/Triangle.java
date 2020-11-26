package uti;

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() {
		super("green", false);
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public double getArea() {
		double halfPerimeter = getPerimeter()/2;
		return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * 
				(halfPerimeter - side2) * (halfPerimeter - side3));
	}
	
	public String printRectangle() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 
				+ " side3 = " + side3;

	}
}

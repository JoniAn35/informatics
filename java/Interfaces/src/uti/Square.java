package uti;

public class Square extends GeometricObject{
	private double side;
	
	public Square() {
		super();
		setSide(1);
	}
	
	public Square(String color, boolean filled, double side) {
		super(color,filled);
		this.setSide(side);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public void howToColor() {
		System.out.println("Color the 4 sides.");
	}
	
	public double getArea() {
		return this.side * this.side;
	}
}

package uti;

public class Rectangle extends GeometricObject{
	private double width = 1;
	private double height = 1;
	
	public Rectangle() {
		this.objectType = "Rectangle";
	}
	
	public Rectangle(double width, double height) {
		this.setWidth(width);
		this.setHeight(height);
		this.objectType = "Rectangle";
	}
	
	public Rectangle(double width, double height, String color, boolean filled) {
		this.setWidth(width);
		this.setHeight(height);
		setColor(color);
		setFilled(filled);
		this.objectType = "Rectangle";
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return this.height * this.width;
	}
}

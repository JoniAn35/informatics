package uti;

import java.lang.Math; 

public class regularPolygon {
	private int n = 3;
	private double sideLength = 1;
	private double x = 0;
	private double y = 0;
	
	public regularPolygon() {
	}
	
	public regularPolygon(int n, double sideLength) {
		this.n = n;
		this.sideLength = sideLength;
		this.x = 0;
		this.y = 0;
	}
	
	public regularPolygon(int n, double sideLength, double x, double y) {
		this.n = n;
		this.sideLength = sideLength;
		this.x = x;
		this.y = y;
	}
	
	public int getN() {
		return this.n;
	}
	
	public void setN(int newN) {
		this.n = newN;
	}
	
	public double getSideLength() {
		return this.sideLength;
	}
	
	public void setSideLength(double newSideLength) {
		this.sideLength = newSideLength;
	}
	
	public double getX() {
		return this.x;
	}
	
	public void setX(double newX) {
		this.x = newX;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void setY(double newY) {
		this.y = newY;
	}
	
	public double getPerimeter() {
		return n * sideLength;
	}
	
	public double getArea() {
		double radians = Math.toRadians(180/n);
		return (n * sideLength * sideLength) / (4 * Math.tan(radians));
	}
}
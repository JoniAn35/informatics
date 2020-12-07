package uti;

public  abstract class GeometricObject implements Colorable{
	private String color = "white";
	private boolean filled = true;
	private java.util.Date dateCreated;
	
	public GeometricObject() {
		setDateCreated(new java.util.Date());
	}
	
	public GeometricObject(String color, boolean filled) {
		setDateCreated(new java.util.Date());
		this.setColor(color);
		this.setFilled(filled);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public String toString() {
		return "created on " + dateCreated + "\ncolor " + color + " and filled " + filled;
	}
	
	public abstract double getArea();
}

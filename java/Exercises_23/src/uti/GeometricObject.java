package uti;

public  abstract class GeometricObject implements Comparable<GeometricObject> {
	private String color = "white";
	private boolean filled = true;
	private java.util.Date dateCreated;
	protected String objectType = "Generic";
	
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
	
	public java.util.Date getDateCreated() {
		return this.dateCreated;
	}
	
	public String toString() {
		return this.objectType + ": created on " + dateCreated + "; color " + color + " and filled " + filled + " area: " + 
					getArea() + "\n";
	}
	
	public abstract double getArea();
	
	public static GeometricObject max(GeometricObject a, GeometricObject b) {
		return (a.getArea() > b.getArea() ? a:b);
	}
	
	@Override
	public int compareTo(GeometricObject o) {
		// TODO Auto-generated method stub
		return ((Double)this.getArea()).compareTo(o.getArea());
	}
}


//compareTo(Object obj) method
//
//public int compareTo(Object obj): It is used to compare the current object with the specified object. It returns
//
//positive integer, if the current object is greater than the specified object.
//negative integer, if the current object is less than the specified object.
//zero, if the current object is equal to the specified object.

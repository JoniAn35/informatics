package uti;

public class fan {
	int slow = 1;
	int medium = 2;
	int fast = 3;
	
	private int speed = slow;
	private boolean switchedOn = false;
	private double radius = 5;
	private String color = "blue";

	public fan() {
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int newSpeed) {
		this.speed = newSpeed;
	}
	
	public boolean getSwitchedOn() {
		return this.switchedOn;
	}
	
	public void setSwitchedOn(boolean newOn) {
		this.switchedOn = newOn;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public String toString() {
		if(switchedOn) {
			return speed + color + radius;
		}
		
		return color + radius + "the fan is off";
	}
}

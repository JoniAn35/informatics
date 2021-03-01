package testRecursion;

public class Orchid extends Plant{
	private int water = 2;
	
	Orchid(String name, String light) {
		super(name, light);
	}
	
	public void waterIt() {
		System.out.println("Put the " + super.getName() + 
				" in a bowl and fill the bowl with water. Water it " + water + " times a week.");
	}
	
	public int getWater() {
		return water;
	}
	
	public void setWater() {
		this.water = water;
	}
}

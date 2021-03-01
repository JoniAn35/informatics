package testRecursion;

public class Flytrap extends Plant{
	private int flies = 10;
	
	Flytrap (String name, String light) {
		super(name, light);
	}
	
	public void waterIt() {
		System.out.println("This is a " + super.getName() + 
				" so you have to give it some flies. Give it " + flies + " flies a week.");
	}
	
	public void setFlies() {
		this.flies = flies;
	}
	
	public int getFlies() {
		return flies;
	}
}

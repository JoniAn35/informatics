package testRecursion;

public class Plant {
	private String name;
	private String light;
	
	Plant(String name, String light) {
		this.name = name;
		this.light = light;
		System.out.println("The plant is " + this.name);
	}
	
	public void waterIt() {
		System.out.println("Just put water in the pot.");
	}

	public String getLight() {
		return light;
	}
	
	public void setLight(String light) {
		this.light = light;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

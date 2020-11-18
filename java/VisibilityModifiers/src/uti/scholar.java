package uti;

public class scholar {
	private String name;
	private double averageProgress;
	
	public scholar () {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getProgress() {
		return averageProgress;
	}
	
	public void setProgress(double progress) {
		this.averageProgress = progress;
	}
	
	public scholar (String name, double progress) {
		this.name = name;
		this.averageProgress = progress;
	}
	
	public boolean getScholarship () {
		return this.averageProgress >= 5.75;
	}
}

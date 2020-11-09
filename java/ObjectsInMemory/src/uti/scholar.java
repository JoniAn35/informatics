package uti;

public class scholar {
	String name;
	double averageProgress;
	
	public scholar () {
	}
	
	public scholar (String name, double progress) {
		this.name = name;
		this.averageProgress = progress;
	}
	
	public boolean getScholarship () {
		return this.averageProgress >= 5.75;
	}
}

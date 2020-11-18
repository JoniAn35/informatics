package uti;

public class MyPoint {
	private int x, y;
	
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(MyPoint n) {
		return (double)Math.sqrt((n.x - x) * (n.x - x) + (n.y - y) * (n.y - y));
	}
	
	public double distance(int x, int y) {
		return (double)Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}
	
	public static double distance(MyPoint n, MyPoint m) {
		return (double)Math.sqrt((n.x - m.x) * (n.x - m.x) + (n.y - m.y) * (n.y - m.y));
	}
}

package person;

public class Staff extends Employee{
	String title;
	
	public String toString() {
		return super.toString() + "\nTitel: " + title;
	}
}

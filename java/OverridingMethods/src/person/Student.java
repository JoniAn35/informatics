package person;

public class Student extends Person {
	String classStatus;
	
	public String toString() {
		return super.toString() + "\nStatus: " + classStatus;
		
	}
}

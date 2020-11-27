package person;

public class Employee extends Person{
	String office;
	double salary;
	private java.util.Date dateHired;
	
	public Employee() {
		dateHired = new java.util.Date();
	}
	
	public String toString() {
		return super.toString() + "\nOffice: " + office + "\nSalary: " + salary + "\nHired: " + dateHired;
	}
}

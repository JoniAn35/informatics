package person;

public class Faculty extends Employee{
	int officeHours = 35;
	String rank = "employee";
	
	public String toString() {
		return super.toString() + "\nOffice Hours: " + officeHours + "\nRank: " + rank;
	}
}

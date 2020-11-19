package uti;

public class Course {
	private String courseName;
	private String[] stidents = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}
	
	public void addStudent(String student) {
		// adds a new student to the course
	}
	
	public void dropStudent(String student) {
		// drops a new student from the course
	}

	public String[] getStidents() {
		return stidents;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
}

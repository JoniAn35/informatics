package uti;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents = 0;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}
	
	public void addStudent(String student) {
		int i = 0;
		
		while (i < 100 && students[i] != null) {
			i++;
		}
		
		students[i] = student;
	}
	
	public void dropStudent(String student) {
		int i = 0;
		
		while (students[i] != student) {
			i++;
		}
		
		while (i < 99 && students[i] != null) {
			students[i] = students[++i];
		}
		
		students[i] = "null";
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		while (numberOfStudents < 100 && students[numberOfStudents] != null) {
			numberOfStudents++;
		}
		return numberOfStudents;
	}
	
}

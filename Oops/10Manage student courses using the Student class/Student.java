package exercise10;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private int grade;
	private ArrayList<String> courses;
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
		this.courses = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public ArrayList<String> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}
	
	public void addCourse(String course) {
		this.courses.add(course);
	}
	
	public void removeCoure(String course) {
		this.courses.remove(course);
	}
	
	public void printStudentDetail() {
		System.out.println("Name: "+ name);
		System.out.println("Grade: "+ grade);
	}
	
	

}

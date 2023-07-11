package exercise14;

import java.util.ArrayList;

public class School {
	
	private ArrayList<Student> students;
	private ArrayList<Teacher> teachers;
	private ArrayList<SchoolClass> classes;
	
	public School() {
		this.students = new ArrayList<>();
		this.teachers = new ArrayList<>();
		this.classes = new ArrayList<>();
	}
	
	//Add and Remove students into School
	public void addStudent(Student student) {
		students.add(student);
	}
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	
	//Add and Remove Teachers into School
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	public void removeTeachers(Teacher teacher) {
		teachers.remove(teacher);
	}
	
	
	//Add and remove Classes from school
	public void addClass(SchoolClass schoolClass) {
		classes.add(schoolClass);
	}
	public void removeClass(SchoolClass schoolClass) {
		classes.remove(schoolClass);
	}
	
	
	//Getters for student, teacher and class
	public ArrayList<Student> getStudents(){
		return students;
	}
	public ArrayList<Teacher> getTeachers(){
		return teachers;
	}
	public ArrayList<SchoolClass> getClasses(){
		return classes;
	}
	
	
	
	

}

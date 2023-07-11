package exercise14;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		//Creating school
		School school = new School();

		//Creating teachers;
		Teacher teacher1 = new Teacher("Ram" , "Maths");
		Teacher teacher2 = new Teacher("Shyam" , "Physics");
		Teacher teacher3 = new Teacher("Mohan" , "Chemistry");

		//Adding teachers into School
		school.addTeacher(teacher1);
		school.addTeacher(teacher2);
		school.addTeacher(teacher3);

		//Creating students
		Student student1 = new Student("Ravi", 101);
		Student student2 = new Student("Ravi", 102);
		Student student3 = new Student("Ravi", 103);
		Student student4 = new Student("Ravi", 104);

		//Adding students to School
		school.addStudent(student1);
		school.addStudent(student2);
		school.addStudent(student3);
		school.addStudent(student4);


		//CREATING CLASSES	
		//creating math class and adding all students 1,2,3,4
		SchoolClass mathClass = new SchoolClass("Maths", teacher1);
		mathClass.addStudent(student1);
		mathClass.addStudent(student2);
		mathClass.addStudent(student3);
		mathClass.addStudent(student4);

		//creating Physics class and adding only students 1 and 4
		SchoolClass physicsClass = new SchoolClass("Physics", teacher2);
		physicsClass.addStudent(student1);
		physicsClass.addStudent(student4);

		//creating Chemistry class and adding all students 1,2,3,4
		SchoolClass chemistryClass = new SchoolClass("Chem", teacher3);
		chemistryClass.addStudent(student1);
		chemistryClass.addStudent(student2);
		chemistryClass.addStudent(student3);
		chemistryClass.addStudent(student4);

		//ADDING CLASSES INTO SCHOOL
		school.addClass(mathClass);
		school.addClass(physicsClass);
		school.addClass(chemistryClass);

		//School Information
		System.out.println("=========SCHOOL DETAILS==========");
		System.out.println("Number of Students:	"+ school.getStudents().size());
		System.out.println("Number of Teachers:	"+ school.getTeachers().size());
		System.out.println("Number of classes:	"+ school.getClasses().size());
		System.out.println();

		//CLASS INFORMATION
		System.out.println("==========CLASS INFORMATION==========");
		ArrayList<SchoolClass> classes = school.getClasses();
		System.out.println("Sl.No	Class_Name	Teachers_Name	No of Students");
		for(int i=0; i<classes.size(); i++) {
			System.out.println(i+1 + "	"+ classes.get(i).getClassName() + "		"+classes.get(i).getTeacher().getName() + "		"+classes.get(i).getStudents().size());
		}
		System.out.println();

		//REMOVING 1 Student , 1 teacher and 1 classes
		school.removeStudent(student1);
		school.removeTeachers(teacher1);
		school.removeClass(mathClass);

		//School Information after deleting 1 student,1 teacher and 1 class
		//NOTE: here removing only student, teacher and classes and not modifying the classes whic created earlier
		System.out.println("=========SCHOOL DETAILS AFTER REMOVING 1 STUDENT, 1 TEACHER and 1 CLASS==========");
		System.out.println("Number of Students:	"+ school.getStudents().size());
		System.out.println("Number of Teachers:	"+ school.getTeachers().size());
		System.out.println("Number of classes:	"+ school.getClasses().size());
		System.out.println();



	}

}

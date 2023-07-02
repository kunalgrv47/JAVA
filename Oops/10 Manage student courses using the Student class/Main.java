package exercise10;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student("Ram", 10);
		Student student2 = new Student("Mohan", 11);
		Student student3 = new Student("Shyam", 12);
		
		//=============PRINTING STUDENT DETAILS==============
		System.out.println("==========STUDENTS DETAILS==========");
		student1.printStudentDetail();
		student2.printStudentDetail();
		student3.printStudentDetail();
		
		//===========ADDING COURSES TO THE STUDENTS===========
		System.out.println("===========ADDING COURSES==========");
		
		System.out.println("ADDING COURSES FOR "+student1.getName());
		student1.addCourse("Math");
		student1.addCourse("Physics");
		student1.addCourse("Chemistry");
		System.out.println("Courses added for "+student1.getName()+" : "+ student1.getCourses());
		System.out.println();
		
		System.out.println("ADDING COURSES FOR "+student2.getName());
		student2.addCourse("Biology");
		student2.addCourse("Physics");
		student2.addCourse("Chemistry");
		System.out.println("Courses added for "+student2.getName()+" : "+ student2.getCourses());
		System.out.println();
		
		System.out.println("ADDING COURSES FOR "+student3.getName());
		student3.addCourse("Accounts");
		student3.addCourse("Business Management");
		student3.addCourse("GST");
		System.out.println("Courses added for "+student3.getName()+" : "+ student3.getCourses());
		System.out.println();
		
		//Removed Math from te student 1 courses
		System.out.println("*****REMOVED MATH FROM STUDENT 1 COURSE******");
		student1.removeCoure("Math");
		System.out.println();
		
		//================STUDENT DETAILS AFTER SELECTING COURSES================
		System.out.println("======FINAL STUDENT DETAILS AFTER SELECING COURSES========");
		student1.printStudentDetail();
		System.out.println("Courses: "+student1.getCourses());
		System.out.println();
		student2.printStudentDetail();
		System.out.println("Courses: "+student2.getCourses());
		System.out.println();
		student3.printStudentDetail();
		System.out.println("Courses: "+student3.getCourses());
		System.out.println();
		
	}

}

package exercise6;

public class EmployeeUse {

	public static void main(String[] args) {

		//Creating employee
		Employee employee1 = new Employee("Ramesh", "Software Engineer", 50000);
		Employee employee2 = new Employee("Suresh", "Testing Engineer", 40000);

		//Print employee details
		System.out.println("====EMPLOYEE DETAILS BEFORE INCREMENT====");
		employee1.printEmployeeDetails();
		employee2.printEmployeeDetails();

		//Increment salary by some percentage
		System.out.println("======================================");  //to draw seperation line
		employee1.incrementPercentage(10);
		System.out.println("Employee1 salary is incremented by 10%");
		employee2.incrementPercentage(25);
		System.out.println("Employee2 salary is incremented by 25%");
		System.out.println("======================================");  //to draw seperation line
		System.out.println();


		//Print employee details
		System.out.println("====EMPLOYEE DETAILS AFTER INCREMENT====");
		employee1.printEmployeeDetails();
		employee2.printEmployeeDetails();
	}

}

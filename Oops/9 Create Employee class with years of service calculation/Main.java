package exercise9;

import java.time.*;

public class Main {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Ram", 500000, LocalDate.of(2000, 11, 05));
		Employee employee2 = new Employee("Shyam", 50000, LocalDate.of(2010, 01, 01));
		Employee employee3 = new Employee("Mohan", 30000, LocalDate.of(2020, 01, 01));
		
		System.out.println("=====Total Number of Employee:"+Employee.numEmployee+"======");
		System.out.println();
		
		
		
		System.out.println("=========Employee 1 Details==========");
		employee1.getEmployeeDetail();
		System.out.println();
		
		System.out.println("=========Employee 2 Details==========");
		employee2.getEmployeeDetail();
		System.out.println();
		
		System.out.println("=========Employee 3 Details==========");
		employee3.getEmployeeDetail();
	}

}

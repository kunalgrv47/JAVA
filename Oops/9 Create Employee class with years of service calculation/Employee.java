package exercise9;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
	
	private String name;
	private double salary;
	private LocalDate hireDate;
	static int numEmployee = 0;
	
	public Employee(String name, double salary, LocalDate hireDate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
		numEmployee++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	public String getYearOfService() {
		Period servicePeriod = Period.between(hireDate, LocalDate.now());
		int year = servicePeriod.getYears();
		int month = servicePeriod.getMonths();
		int days = servicePeriod.getDays();
		
		return ""+year+"years "+month+"months "+days+"days";
	}
	
	public void getEmployeeDetail() {
		System.out.println("Name:	"+name);
		System.out.println("Salary:	"+salary);
		System.out.println("DOJ	"+ getHireDate());
		System.out.println("YOS:	"+getYearOfService());
		
	}
	
	

}

package exercise6;

public class Employee {
	
	private String name;
	private String jobTitle;
	private double salary;
	
	public Employee(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	//getters and setters for name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//getters and setters for JobTitle
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	//getters and setters for Salary
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//Printing Employee Details
	public void printEmployeeDetails() {
		System.out.println("Name:		"+name);
		System.out.println("Job Title:	"+jobTitle);
		System.out.println("Salary:		"+salary);
		System.out.println();
	
	}
	//Updating new salary if it is getting incremented
	public void incrementPercentage(double percentage) {
		salary = salary + salary*percentage/100;
	}

}

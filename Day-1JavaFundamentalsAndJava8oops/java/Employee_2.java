package oops.java;

class Employee{
	private String name;
	private double baseSalary;
	
	public Employee(String name, double baseSalary) {
		this.name= name;
		this.baseSalary = baseSalary;
	}
	
	public double calculateTotalSalary() {
		return baseSalary;
	}
	
	public String getName() {
		return name;
	}
}

class Manager extends Employee{

	private double incentive;
	
	public Manager(String name, double baseSalary, double incentive) {
		super(name, baseSalary);
		this.incentive= incentive;
	}
	
	public double calculateTotalSalary() {
		return super.calculateTotalSalary()+incentive;
	}
}

class Labour extends Employee{

	private double overtime;
	
	public Labour(String name, double baseSalary, double overtime) {
		super(name, baseSalary);
		this.overtime= overtime;
	}
	
	public double calculateTotalSalary() {
		return super.calculateTotalSalary()+overtime;
	}
}